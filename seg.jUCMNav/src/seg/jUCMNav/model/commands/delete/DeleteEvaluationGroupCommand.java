/**
 * 
 */
package seg.jUCMNav.model.commands.delete;

import grl.EvaluationGroup;

import org.eclipse.gef.commands.Command;

import seg.jUCMNav.model.commands.JUCMNavCommand;
import urn.URNspec;

/**
 * Delete a scenario group. It should have no scenario in it.
 * 
 * @author Jean-Fran�ois Roy
 *
 */
public class DeleteEvaluationGroupCommand extends Command implements JUCMNavCommand {

    private EvaluationGroup group;
    
    // the URNspec in which it is contained
    private URNspec urn;
    /**
     * 
     */
    public DeleteEvaluationGroupCommand(EvaluationGroup group) {
        this.group = group;
        setLabel("DeleteEvaluationGroup");
    }

    /**
     * Only if no scenario in it
     * 
     * @see org.eclipse.gef.commands.Command#canExecute()
     */
    public boolean canExecute() {
        return group != null && group.getScenarios().size() == 0;
    }

    /**
     * @see org.eclipse.gef.commands.Command#execute()
     */
    public void execute() {
        urn = group.getGrlspec().getUrnspec();

        redo();
    }
    
    /**
     * @see org.eclipse.gef.commands.Command#redo()
     */
    public void redo() {
        testPreConditions();

        urn.getGrlspec().getEvaluationGroups().remove(group);

        testPostConditions();
    }
    
    /* (non-Javadoc)
     * @see seg.jUCMNav.model.commands.JUCMNavCommand#testPreConditions()
     */
    public void testPreConditions() {
        assert group != null && urn != null : "pre something is null"; //$NON-NLS-1$
        assert group.getScenarios().size() == 0 : "pre can't delete if still scenarios."; //$NON-NLS-1$
        assert urn.getGrlspec().getEvaluationGroups().contains(group) : "pre group in model"; //$NON-NLS-1$
    }

    /* (non-Javadoc)
     * @see seg.jUCMNav.model.commands.JUCMNavCommand#testPostConditions()
     */
    public void testPostConditions() {
        assert group != null && urn != null : "post something is null"; //$NON-NLS-1$
        assert group.getScenarios().size() == 0 : "post can't delete if still scenarios."; //$NON-NLS-1$
        assert !urn.getGrlspec().getEvaluationGroups().contains(group) : "post group in model"; //$NON-NLS-1$
    }

    /**
     * 
     * @see org.eclipse.gef.commands.Command#undo()
     */
    public void undo() {
        testPostConditions();

        // re-add group
        urn.getGrlspec().getEvaluationGroups().add(group);

        testPreConditions();
    }
}