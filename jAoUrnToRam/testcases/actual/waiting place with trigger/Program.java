package waiting place with trigger;

import ram.reactiveworkflow.ReactiveWorkflowSystem;
import waiting place with trigger.Instantiators.WithoutConcern.Waiting_place_simpleWorkflowInstantiator;

public class Program{

    public static void main(String[] args){
        ReactiveWorkflowSystem reactiveWorkflowSystem=new ReactiveWorkflowSystem();

        Waiting_place_simpleWorkflowInstantiator l_Waiting_place_simpleWorkflowInstantiator=new Waiting_place_simpleWorkflowInstantiator();

        l_Waiting_place_simpleWorkflowInstantiator.link();
        l_Waiting_place_simpleWorkflowInstantiator.bind();
        reactiveWorkflowSystem.addWorkflow(l_Waiting_place_simpleWorkflowInstantiator.workflow);

        reactiveWorkflowSystem.start();
    }
}
