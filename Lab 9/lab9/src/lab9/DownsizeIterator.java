
package lab9;

/**
 *
 * @author Nicholas Vialpando
 * CS 234 - Lab 9
 */

import java.util.LinkedList;
import java.util.ListIterator;

public class DownsizeIterator {
    //declare instance variables
    private int nth;
    
    //declare constructors
    public DownsizeIterator(int nth) {
        this.nth = nth;
    }
    
    //declare instance methods
    public void removeElements(LinkedList<String> list) {
        //declare iterator for list
        ListIterator<String> iterator = list.listIterator();
        
        //print what nth element is being removed
        System.out.print("Removing every nth (" + nth + ") element ");
        
        //use while loop if there is a next node and a for loop to move pointer nth amount of times befor removing
        while(iterator.hasNext()) {
           for(int i = 0; i < nth; i++) {
            iterator.next();
        }
        iterator.remove(); 
        }
        
    }
    
    public void print(LinkedList<String> list) {
        //print initial string to declare content of list one time
        System.out.print("The content of the Linked list is: ");
        
        //use for loop to print out each element of the list
        for(int i=0; i <list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
