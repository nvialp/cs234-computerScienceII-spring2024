
package lab8;

/**
 *
 * @author Nicholas Vialpando
 * CS 234 - Lab 8
 */
public interface Sequences {
    
    //gets value that starts the sequence
    float getInitialValue();
    
    //gets the next element in the sequence
    float getNext();
    
    //restarts the sequence to its initial values 
    void restart();
    
    //sets the starting value for the sequence
    void setStart(float value);
    
    //it returns the n-th element in the sequence
    float getNthElement(int element);
}
