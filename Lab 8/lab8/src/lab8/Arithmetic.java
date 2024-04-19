package lab8;

/**
 *
 * @author Nicholas Vialpando
 * CS 234 - Lab 8
 */
public class Arithmetic implements Sequences {
    //declare instance variables
    public float initialValue;    
    public float element;    
    public float difference;
    
    //declare constructors    
    public Arithmetic(float initialValue, float difference) {
        this.initialValue = initialValue;
        this.element = initialValue;
        this.difference = difference;        
    }
    
    //declare instance methods to implement interface
    public float getInitialValue() {
        return initialValue;
    }
    
    public float getNext(){
        this.element = element + difference;
        return element;
      }
    
    public void restart() {
        this.element = initialValue;
    }
    
    public void setStart(float value) {
        this.initialValue = value;
    }
    
    //formula: Xn = a + d(n-1)
    public float getNthElement(int element) {
        float value = initialValue + (difference * (element - 1));
        return value;
    }
}
