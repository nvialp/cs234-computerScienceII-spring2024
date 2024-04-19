/**
 * @author Nicholas Vialpando
 * CS 234 - Lab 6
 * 03/04/2024
 */
public class Doctor {
    //declare instance variables
    private String name;
    
    //declare constructor
    public Doctor(String docName) {
        this.name = docName;
    }
    
    //declare interface methods
    public String getName() {
        return name;
    }
    
    public void setName(String docName) {
        name = docName;
    }
    
}
