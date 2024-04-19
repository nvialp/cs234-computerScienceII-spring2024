package lab10;

/**
 *
 * @author Nicholas Vialpando
 * cs 234 - lab 10
 */
public class Lab10 {

    public static void main(String[] args) {
        Hospital StEllen = new Hospital();
        StEllen.addPatient("Eduardo", 3);
        StEllen.addPatient("Carlos", 4);
        StEllen.addPatient("Emma", 1);
        StEllen.addPatient("Sarah", 4);
        StEllen.addPatient("Carol", 5);
        
        System.out.println("Next patient is: " + StEllen.nextPatient());
        
        StEllen.removePatient();
        System.out.println("Next patient is: " + StEllen.nextPatient());
    }
    
}
