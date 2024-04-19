/**
 *
 * @author Nicholas Vialpando
 * cs234 - lab 10
 */
import java.util.PriorityQueue;
public class Hospital {
    //declare instance variables
    private PriorityQueue<Patient> queue;
    
    //declare constructor
    public Hospital(){
        this.queue = new PriorityQueue();
    }
    
    public void addPatient(String name, int priority){
        queue.add(new Patient(name, priority));
    }
    
    public Patient removePatient(){
        queue.remove();
        System.out.println("The Doctor finished with the patient."); //prints message to confirm removal of patient
        
        return queue.peek();
    }
    
    public Patient nextPatient(){
        return queue.peek();
    }
}
