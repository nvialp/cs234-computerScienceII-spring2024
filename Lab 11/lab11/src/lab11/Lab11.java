package lab11;

/**
 *
 * @author Nicholas Vialpando
 * CS 234 - Lab 11
 */
public class Lab11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        School mySchool = new School();
        
        mySchool.addStudent("001", "Emma", "Art");
        mySchool.addStudent("002", "John", "CS");
        mySchool.addStudent("003", "Carlos", "Math");
        
        mySchool.getStudentInfo("003");
        
        mySchool.getStudentInfo("005");
    }
    
}
