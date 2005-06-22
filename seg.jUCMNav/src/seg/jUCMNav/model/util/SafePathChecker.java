/*
 * Created on 11-Jun-2005
 *
 */
package seg.jUCMNav.model.util;

import java.util.Iterator;
import java.util.Vector;

import seg.jUCMNav.model.util.modelexplore.GraphExplorer;
import seg.jUCMNav.model.util.modelexplore.queries.DeletionPathFinder;
import seg.jUCMNav.model.util.modelexplore.queries.ReachableNodeFinder;
import seg.jUCMNav.model.util.modelexplore.queries.DeletionPathFinder.QFindSpline;
import seg.jUCMNav.model.util.modelexplore.queries.ReachableNodeFinder.QFindReachableNodes;
import ucm.map.EndPoint;
import ucm.map.NodeConnection;
import ucm.map.PathNode;
import ucm.map.StartPoint;

/**
 * @author jpdaigle, jkealey
 *
 * Check if a proposed fusion of two nodes is <i>safe </i>, that is, will not cause an illegal loop. joinFromPathNode is expected to be a StartPoint or
 * EndPoint, but not enforced.
 * 
 *  
 */
public class SafePathChecker {

    public static boolean isSafeFusion(PathNode joinFromPathNode, NodeConnection joinToNodeConnection) {
        PathNode toNode = joinToNodeConnection.getTarget();
        return isSafeFusion(joinFromPathNode, toNode);
    }

    public static boolean isSafeFusion(PathNode joinFromPathNode, PathNode joinToPathNode) {
        // Query for reachable nodes starting from joinToPathNode: if joinFromPathNode is not included in there,
        // the join won't cause a loop.

        QFindReachableNodes qReachableNodes = new ReachableNodeFinder().new QFindReachableNodes(joinToPathNode);
        ReachableNodeFinder.RReachableNodes rReachableNodes = (ReachableNodeFinder.RReachableNodes) GraphExplorer.getInstance().run(qReachableNodes);
        Vector vReachable = rReachableNodes.getNodes();

        ReachableNodeFinder.QFindReachableNodes qReachableNodes2 = new ReachableNodeFinder().new QFindReachableNodes(joinFromPathNode);
        ReachableNodeFinder.RReachableNodes rReachableNodes2 = (ReachableNodeFinder.RReachableNodes) GraphExplorer.getInstance().run(qReachableNodes2);
        Vector vReachable2 = rReachableNodes2.getNodes();

        if (!vReachable.containsAll(vReachable2)) {
            // different sets -> can always fusion
            // don't verify opposite; trust query returns same vector but in different order (equals doesn't work here)
            return true;
        }
        
        // remove passed start/ends from reachable pathnodes 
        if (joinFromPathNode instanceof StartPoint || joinFromPathNode instanceof EndPoint)
            vReachable.remove(joinFromPathNode);
        if (joinToPathNode instanceof StartPoint || joinToPathNode instanceof EndPoint)
            vReachable.remove(joinToPathNode);

        // count remaining start/ends
        int iStartPoints, iEndPoints;
        iStartPoints = iEndPoints = 0;

        for (Iterator iter = vReachable.iterator(); iter.hasNext();) {
            PathNode pn = (PathNode) iter.next();
            if (pn instanceof StartPoint)
                iStartPoints++;
            else if (pn instanceof EndPoint)
                iEndPoints++;
        }

        // verify that merger will leave at least one start and end point in the path
        if (iStartPoints>0 && iEndPoints>0) {

            // find the node connection following the start or preceeding the end. 
            NodeConnection nc = null;
            if (joinFromPathNode instanceof StartPoint)
                nc = (NodeConnection) joinFromPathNode.getSucc().get(0);
            else if (joinFromPathNode instanceof EndPoint)
                nc = (NodeConnection) joinFromPathNode.getPred().get(0);
            else if (joinToPathNode instanceof StartPoint)
                nc = (NodeConnection) joinToPathNode.getSucc().get(0);
            else if (joinToPathNode instanceof EndPoint)
                nc = (NodeConnection) joinToPathNode.getPred().get(0);
            else
                assert false : "incorrect call to isSafeFusion";

            // we want to make sure we aren't merging elements on the same deletion path to cause illegal loops. 
            QFindSpline qry = new DeletionPathFinder().new QFindSpline(nc);
            DeletionPathFinder.RSpline resp = (DeletionPathFinder.RSpline) GraphExplorer.getInstance().run(qry);
            Vector nodes = resp.getPathNodes();

            if (joinFromPathNode instanceof StartPoint || joinFromPathNode instanceof EndPoint)
                return !nodes.contains(joinToPathNode);
            else
                return !nodes.contains(joinFromPathNode);

        } else
            return false;

    }

}