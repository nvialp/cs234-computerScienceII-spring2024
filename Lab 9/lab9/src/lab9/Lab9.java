
package lab9;

/**
 *
 * @author Nicholas Vialpando
 * CS 234 - Lab 9
 */

import java.util.LinkedList;
import java.util.ListIterator;

public class Lab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> employees = new LinkedList<>();
        employees.add("Eduardo");
        employees.add("Emma");
        employees.add("Carlos");
        employees.add("Luis");
        employees.add("Maria");
        employees.add("John");
        
        DownsizeIterator ds = new DownsizeIterator(3);
        ds.print(employees);
        ds.removeElements(employees);
        ds.print(employees);        
    }
    
}
