
package school;

/**
 * @author Nicholas Vialpando
 * CS 234 - Lab 6
 */
public class Adjunct extends Instructor {
    //declare instance variables
    int numHours;
    
    //declare constructor
    public Adjunct(int hours, String name, String location) {
        numHours = hours;
        super.setName(name);
        super.setLocation(location);        
    }
    
    //declare instance methods
    public void setNumHours(int hours) {
        numHours = hours;
    }
    
    public int getNumHours() {
        return numHours;
    }
}
