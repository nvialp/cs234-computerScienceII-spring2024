
package school;

/**
 * @author Nicholas Vialpando
 * CS 234 - Lab 7
 */
public class Instructor {
   //declare instance variables
    private String name;
    private String location;
    
    //declare constructor
    public Instructor() {
        name = "STAFF";
        location = "Portales";
    }
    
    public Instructor(String name, String location) {
        this.name = name;
        this.location = location;
    }
    
    //declare instance methods
    public String getName() {
        return name;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
}
