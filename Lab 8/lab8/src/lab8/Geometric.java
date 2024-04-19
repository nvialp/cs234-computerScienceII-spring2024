package lab8;

/**
 *
 * @author Nicholas Vialpando
 * CS 234 - Lab 8
 */
public class Geometric implements Sequences {
    //declare instance variables
    public float initialValue;
    
    public float element;
    
    public float ratio;
    
    //declare constructor
    public Geometric(float initialValue, float ratio) {
        this.initialValue = initialValue;
        this.ratio = ratio;
        this.element = initialValue;
    }
    
    //declare interface methods to implement interface
    public float getInitialValue() {
        return initialValue;
    }
    
    public float getNext(){
        float nextElement = element * ratio;
        element = nextElement;
        return nextElement;
      }
    
    public void restart() {
        this.element = initialValue;
    }
    
    public void setStart(float value) {
        this.initialValue = value;
    }
    
    //formula:  Xn = ar^(n-1)
    public float getNthElement(int element) {
        float value = initialValue * (float) (Math.pow(ratio, (element - 1)));
        return value;
    }
    
}
