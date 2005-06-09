/*
 * Created on 2005-01-30
 *
 */
package seg.jUCMNav.editparts;

import java.util.Map;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.views.properties.IPropertySource;

import seg.jUCMNav.editpolicies.element.NodeConnectionComponentEditPolicy;
import seg.jUCMNav.editpolicies.feedback.NodeConnectionFeedbackEditPolicy;
import seg.jUCMNav.editpolicies.layout.NodeConnectionXYLayoutEditPolicy;
import seg.jUCMNav.figures.SplineConnection;
import seg.jUCMNav.figures.util.StubConnectionEndpointLocator;
import seg.jUCMNav.views.property.UCMElementPropertySource;
import ucm.UcmPackage;
import ucm.map.MapPackage;
import ucm.map.NodeConnection;
import ucm.map.PathGraph;
import ucm.map.Stub;

/**
 * @author Etienne Tremblay
 *  
 */
public class NodeConnectionEditPart extends AbstractConnectionEditPart {

    private PathGraph diagram;
    protected IPropertySource propertySource = null;
    private Label endLabel, startLabel;

    NodeConnectionAdapter adapter;

    public NodeConnectionEditPart(NodeConnection link, PathGraph diagram) {
        super();
        setModel(link);
        this.diagram = diagram;

        adapter = new NodeConnectionAdapter((Notifier) getModel());
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.gef.EditPart#activate()
     */
    public void activate() {
        if (!isActive())
            ((EObject) getModel()).eAdapters().add(adapter);
        super.activate();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.gef.EditPart#deactivate()
     */
    public void deactivate() {
        if (isActive())
            ((EObject) getModel()).eAdapters().remove(adapter);
        super.deactivate();
        if (endLabel != null) {
            ((SplineConnection) getFigure()).remove(endLabel);
            endLabel = null;
        }

        if (startLabel != null) {
            ((SplineConnection) getFigure()).remove(startLabel);
            startLabel = null;
        }

    }

    public PathGraph getPathGraph() {
        return diagram;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
     */
    protected void createEditPolicies() {
        installEditPolicy(EditPolicy.LAYOUT_ROLE, new NodeConnectionXYLayoutEditPolicy());
        installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, new NodeConnectionFeedbackEditPolicy());
        installEditPolicy(EditPolicy.COMPONENT_ROLE, new NodeConnectionComponentEditPolicy());
    }

    private NodeConnection getLink() {
        return (NodeConnection) getModel();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
     */
    protected IFigure createFigure() {
        SplineConnection connection = new SplineConnection(getLink());
        connection.setRoutingConstraint(getLink());
        connection.setLineWidth(3);
        //		PolygonDecoration p = new PolygonDecoration();
        //		connection.setTargetDecoration(p); // arrow at target endpoint

        if (getLink().getTarget() instanceof Stub) {
            addEndLabel(connection);
        }
        if (getLink().getSource() instanceof Stub) {
            addStartLabel(connection);
        }
        return connection;
    }

    /**
     * @param connection
     */
    private void addEndLabel(SplineConnection connection) {
        if (endLabel != null)
            getFigure().remove(endLabel);
        int index = getLink().getTarget().getPred().indexOf(getLink());
        StubConnectionEndpointLocator targetEndpointLocator = new StubConnectionEndpointLocator(connection, true);
        targetEndpointLocator.setVDistance(10);
        targetEndpointLocator.setUDistance(30);
        endLabel = new Label("IN" + Integer.toString(index + 1));
        endLabel.setForegroundColor(new Color(null, 150, 150, 150));
        connection.add(endLabel, targetEndpointLocator);
    }

    /**
     * @param connection
     */
    private void addStartLabel(SplineConnection connection) {
        if (startLabel != null)
            getFigure().remove(startLabel);
        int index = getLink().getSource().getSucc().indexOf(getLink());
        StubConnectionEndpointLocator targetEndpointLocator = new StubConnectionEndpointLocator(connection, false);
        targetEndpointLocator.setVDistance(10);
        targetEndpointLocator.setUDistance(30);
        startLabel = new Label("OUT" + Integer.toString(index + 1));
        startLabel.setForegroundColor(new Color(null, 150, 150, 150));
        connection.add(startLabel, targetEndpointLocator);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.gef.editparts.AbstractEditPart#refreshVisuals()
     */
    protected void refreshVisuals() {
        if (getLink().getTarget() instanceof Stub) {
            addEndLabel((SplineConnection) getFigure());
        } else if (endLabel != null) {
            ((SplineConnection) getFigure()).remove(endLabel);
            endLabel = null;
        }

        if (getLink().getSource() instanceof Stub) {
            addStartLabel((SplineConnection) getFigure());
        } else if (startLabel != null) {
            ((SplineConnection) getFigure()).remove(startLabel);
            startLabel = null;
        }

        
        // hide in print mode.
        if (startLabel != null) {
            startLabel.setVisible(((ConnectionOnBottomRootEditPart) getRoot()).getMode() == 0);
        }

        if (endLabel != null) {
            endLabel.setVisible(((ConnectionOnBottomRootEditPart) getRoot()).getMode() == 0);
        }
        super.refreshVisuals();
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.gef.editparts.AbstractConnectionEditPart#getAdapter(java.lang.Class)
     */
    public Object getAdapter(Class adapter) {
        if (IPropertySource.class == adapter) {
            if (propertySource == null) {
                propertySource = new UCMElementPropertySource((EObject) getModel());
            }
            return propertySource;
        }
        return super.getAdapter(adapter);
    }

    private class NodeConnectionAdapter implements Adapter {
        private Notifier target;

        public NodeConnectionAdapter(Notifier target) {
            this.target = target;
        }

        public void notifyChanged(Notification notification) {

            int type = notification.getEventType();
            int featureId = notification.getFeatureID(UcmPackage.class);
            switch (type) {
            case Notification.SET:
                if (featureId == MapPackage.NODE_CONNECTION__CONDITION) {
                    EditPartViewer viewer = getViewer();
                    if (viewer != null) {
                        Map registry = viewer.getEditPartRegistry();
                        if (registry != null) {
                            MapAndPathGraphEditPart part = (MapAndPathGraphEditPart) registry.get(getPathGraph().getMap());
                            if (part != null) {

                                part.notifyChanged(notification);
                            }
                        }
                    }
                }
                break;
            }
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.eclipse.emf.common.notify.Adapter#getTarget()
         */
        public Notifier getTarget() {
            return target;
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.eclipse.emf.common.notify.Adapter#setTarget(org.eclipse.emf.common.notify.Notifier)
         */
        public void setTarget(Notifier newTarget) {
            target = newTarget;
        }

        /*
         * (non-Javadoc)
         * 
         * @see org.eclipse.emf.common.notify.Adapter#isAdapterForType(java.lang.Object)
         */
        public boolean isAdapterForType(Object type) {
            return type.equals(getModel().getClass());
        }
    }
}