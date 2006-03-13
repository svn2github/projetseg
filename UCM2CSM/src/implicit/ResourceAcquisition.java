package implicit;

import java.io.PrintStream;
import java.util.Stack;

import ucm.map.ComponentRef;
import ucm.map.NodeConnection;
import ucm.map.PathNode;

/**
 * <!-- begin-user-doc -->
 * Inserts Resource Acquisition objects in duplicate map 
 * <!-- end-user-doc -->
 * @see implicit
 * @generated
 */

public class ResourceAcquisition {
       
    // constructor 
    public ResourceAcquisition(){        
    }
    
    // adds all hyperedge parent components to stack
    public void findParentsRA(ComponentRef component_ref, Stack edge_stack){
        // The top of the stack is the outermost component        
        ComponentRef parent_ref = (ComponentRef) component_ref.getParent();
        if (parent_ref != null){
            edge_stack.push(parent_ref);
            findParentsRA(parent_ref, edge_stack);
        }                
    }
  
    // Resource Acquire algorithm
    public void acquireResource(PathNode curr_edge, CSMDupNodeList dup_map, PrintStream print){
        
        // local variables                  
        Stack curr_edge_stack = new Stack ();
        CSMDupNodeList prev_edge_list = new CSMDupNodeList();
        
        ComponentRef curr_edge_comp_ref = (ComponentRef) curr_edge.getContRef();
        
        // current edge is inside component 
        if (curr_edge_comp_ref != null ){
            
            // populate local prev_edge_list 
            boolean done = false;
            PathNode StartPoint = dup_map.getNode(0); // obtain startpoint
            for (int i = 0; !done && i < dup_map.size(); i++) {
                PathNode node = dup_map.getNode(i);
                if (node == curr_edge){
                   done = true; 
                }
                else{
                        prev_edge_list.add(node);                        
                }
            }
            
            // find the parent component of current edge                                        
            curr_edge_stack.push(curr_edge_comp_ref);
            findParentsRA(curr_edge_comp_ref, curr_edge_stack);
            // debug - curr_edge_stack contents
            for (int b = 0; b < curr_edge_stack.size(); b ++){ 
                 System.out.println("Curr_edge_stack " + b + " " + curr_edge_stack.get(b));
            } // for
            
            if (!prev_edge_list.isEmpty()){
                for (int j = 0; j < prev_edge_list.size(); j++){                      
                    // Previous edge must be in a different component                    
                    PathNode prev_edge = prev_edge_list.getNode(j);
                    System.out.println("prev_edge: " + prev_edge);
                    ComponentRef prev_edge_comp_ref = (ComponentRef) prev_edge.getContRef(); 
                    System.out.println("prev_edge_comp_ref: " + prev_edge_comp_ref);
                    
                    Stack outside_comp_stack = new Stack();
                    if (prev_edge_comp_ref == null) {
                        for (int b = 0; b < curr_edge_stack.size(); b ++){ 
                            outside_comp_stack.push(curr_edge_stack.get(b)); //System.out.println("curr_edge_stack " + b + " " + curr_edge_stack.get(b));
                       } // for 
                       int id = 100;
                       while (!outside_comp_stack.isEmpty()){
                           ComponentRef comp = (ComponentRef) outside_comp_stack.pop();
                           // create a resource acquire component and an empty point (sequence)                           
                           CSMDupNode ra_node = new CSMDupNode(id);
                           acquireComp(comp,print,ra_node);
                           id++;
                       }
                    }
                    else if (prev_edge_comp_ref != curr_edge_comp_ref){
                        // Find which parents of curr_edge are not included in those prev_edge
                        Stack prev_edge_stack = new Stack ();
                        prev_edge_stack.push(prev_edge_comp_ref);
                        findParentsRA(prev_edge_comp_ref, prev_edge_stack);
                        
                        // Difference between component stacks, keeps outside components
                        outside_comp_stack = stackDifference(curr_edge_stack,prev_edge_stack);
                       
                        // debug - prev_edge_stack contents
                        for (int a = 0; a < prev_edge_stack.size(); a ++){ 
                            System.out.println("prev_edge_stack " + a + " " + prev_edge_stack.get(a));
                        } // for 
                        
                        // debug - curr_edge_stack contents
                        for (int b = 0; b < curr_edge_stack.size(); b ++){ 
                             System.out.println("curr_edge_stack " + b + " " + curr_edge_stack.get(b));
                        } // for
                        
                        // debug - outside_comp_stack contents
                        for (int c = 0; c < outside_comp_stack.size(); c ++){ 
                             System.out.println("outside_comp_stack " + c + " " + outside_comp_stack.get(c));
                        } //for                            
                    
                        // Acquire the components of the parents
                        int id = 200;
                        while (!outside_comp_stack.isEmpty()){
                            ComponentRef comp = (ComponentRef) outside_comp_stack.pop();
                            // create a resource acquire component and an empty point (sequence)                           
                            CSMDupNode ra_node = new CSMDupNode(id);
                            acquireComp(comp,print,ra_node);
                            id++;
                        }
                    }// if                    
                }// for                
            } // if
        } // if    
        else {
            // Must be a start point, acquire the components            
            int id = 300;
            while (!curr_edge_stack.isEmpty()){
                ComponentRef comp = (ComponentRef) curr_edge_stack.pop();
                // create a resource acquire component and an empty point (sequence)                           
                CSMDupNode ra_node = new CSMDupNode(100);
                acquireComp(comp,print,ra_node);
                id++;
            }
        } // else                
    } // function
    
    // prints XML representation of Resource Acquire element
    public void acquireComp(ComponentRef comp, PrintStream ps, CSMDupNode node){        
        // object attributes 
        String ra_attributes = "<ResourceAcquire id=\"" + node.getId() + "\"" + " acquire=\"" + "c" + comp.getId() + "\"" + "/>";                        
        ps.println("          " + ra_attributes);         
    }
    
    // calculates the difference between two stacks
    public Stack stackDifference(Stack stack_one, Stack stack_two){
        Stack stack_three = new Stack();
        for (int i=0; i<stack_one.size();i++){
            if(!stack_two.contains(stack_one.get(i))){
                stack_three.push(stack_one.get(i));
            }
        }
        return stack_three;
    }
}