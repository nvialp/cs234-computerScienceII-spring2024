/**
 *
 * @author Nicholas Vialpando
 */
public class Patient{
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
    
    public String toString(){
        //fix me
        return "fix me";
    }
    
    public int compareTo(Patient){
        return -1; //fix me
    }
}
