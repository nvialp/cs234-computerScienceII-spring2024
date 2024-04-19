/**
 *
 * @author Nicholas Vialpando
 * cs234 - lab 10
 */

import java.lang.Comparable;
public class Patient implements Comparable<Patient> {
    //declare instance variables
    private String name;
    private int priority;
    
    //declare constructor
    public Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
    
    //declare instance methods
    public String getName(){
        return name;
    }
    
    public int getPriority(){
        return priority;
    }
    
    //method to print out patient info
    @Override public String toString(){
        String patientInfo = this.name + " (Priority: " + this.priority + ")";
        return patientInfo;
    }
    
    //method to implement comparable so that priority can be compared
    @Override public int compareTo(Patient patient){
        if(this.priority < patient.priority){
            return 1;
        }
        
        if(this.priority > patient.priority){
            return -1;
        }
        
        return 0;
    }
}
