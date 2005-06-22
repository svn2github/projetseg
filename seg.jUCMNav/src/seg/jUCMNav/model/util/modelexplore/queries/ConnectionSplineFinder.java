/*
 * Created on 20-Jun-2005
 *
 */
package seg.jUCMNav.model.util.modelexplore.queries;

import java.util.Stack;
import java.util.Vector;

import seg.jUCMNav.model.util.modelexplore.AbstractQueryProcessor;
import seg.jUCMNav.model.util.modelexplore.IQueryProcessorChain;
import seg.jUCMNav.model.util.modelexplore.QueryObject;
import seg.jUCMNav.model.util.modelexplore.QueryRequest;
import seg.jUCMNav.model.util.modelexplore.QueryResponse;
import ucm.map.Connect;
import ucm.map.NodeConnection;
import ucm.map.PathNode;

/**
 * @author jkealey
 * 
 * Query processor for returning all node connections in a spline, given a node connection on this spline.
 *  
 */
public class ConnectionSplineFinder extends AbstractQueryProcessor implements IQueryProcessorChain {

    protected Vector _splinePath;

    public ConnectionSplineFinder() {
        this._answerQueryTypes = new String[] { QueryObject.FINDSPLINE };
    }

    /*
     * (non-Javadoc)
     * 
     * @see seg.jUCMNav.model.util.modelexplore.AbstractQueryProcessor#runImpl(seg.jUCMNav.model.util.modelexplore.QueryRequest)
     */
    public QueryResponse runImpl(QueryRequest q) {
        _splinePath = new Vector();

        if (((QFindSpline) q).getStartNodeConnection() != null) {
            // call recursive function processNode with the start node
            processNodeConnection(((QFindSpline) q).getStartNodeConnection());
        }

        return getResponse();
    }

    /**
     * @return
     */
    protected QueryResponse getResponse() {
        // Return a response containing the visited node list
        RSpline r = new RSpline();
        r.setConnections(_splinePath);
        return r;
    }

    /**
     * We want to return an ordered sequence of NodeConnections that form a spline, containing n.
     * 
     * We route through simple nodes (1 in / 1 out) and PathNodes that might have connections / timeout paths. We don't investigate node connections that are
     * connected to Connect elements, as they have no visual representation.
     * 
     * @param n
     */
    protected void processNodeConnection(NodeConnection n) {
        //        System.out.println("starts with: " + n.getSource());
        //        System.out.println("ends with: " + n.getTarget());

        if (n.getTarget() instanceof Connect || n.getSource() instanceof Connect)
            return;
        PathNode source = n.getSource();
        PathNode target = n.getTarget();
        NodeConnection nc = n;

        if (source == null || target == null)
            return;

        Stack s = new Stack();
        // navigate back to the start
        while (nc != null && source != null) {
            // add the connection
            s.push(nc);
            // if we can continue further
            if (source.getSucc().indexOf(nc) == 0 && source.getPred().size() > 0) {
                nc = (NodeConnection) source.getPred().get(0);
                source = nc.getSource();

                // prevent infinite loops
                if (s.contains(nc) || isPathStopper(source))
                    nc = null;
            } else
                nc = null;
        }

        assert s.contains(n) : "missing initial connection";

        // we went through the spline in the inverse direction so we need to insert them in the opposite order using the stack
        while (s.size() > 0) {
            _splinePath.add(s.pop());
        }

        nc = n;

        while (nc != null && target != null) {

            // adding the connection
            //
            // checking because we don't want to add the middle one twice
            if (!_splinePath.contains(nc))
                _splinePath.add(nc);

            //if we can continue further
            if (target.getPred().indexOf(nc) == 0 && target.getSucc().size() > 0) {
                nc = (NodeConnection) target.getSucc().get(0);
                target = nc.getTarget();
                // prevent infinite loops
                if (_splinePath.contains(nc) || isPathStopper(target))
                    nc = null;
            } else
                nc = null;

        }
    }

    /**
     * @param node
     * @return returns true if path traversal should be stopped when hitting one of this node. 
     */
    public static boolean isPathStopper(PathNode node) {
        return (node instanceof Connect);
    }

    public class QFindSpline extends QueryRequest {
        // Finds reachable node connections starting with a NodeConnection
        NodeConnection _StartNodeConnection;

        public QFindSpline(NodeConnection nodeConnection) {
            this._queryType = QueryObject.FINDSPLINE;
            _StartNodeConnection = nodeConnection;
        }

        public NodeConnection getStartNodeConnection() {
            return _StartNodeConnection;
        }
    }

    public class RSpline extends QueryResponse {
        /* Data structure (query response) for passing a vector of connections */
        private Vector connections;

        public RSpline() {
            this._queryType = QueryObject.FINDSPLINE;
        }

        /**
         * @return Returns the node connections.
         */
        public Vector getConnections() {
            return connections;
        }

        /**
         * @param nodes
         *            The nodes connections to set.
         */
        public void setConnections(Vector connections) {
            this.connections = connections;
        }
    }

}