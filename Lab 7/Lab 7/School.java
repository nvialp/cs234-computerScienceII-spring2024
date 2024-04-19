
import java.util.ArrayList;

/**
 * @author Nicholas Vialpando
 * CS 234 - Lab 6
 */
public class School {
    //declare instance variables
    private ArrayList<Course> courses = new ArrayList<>();
    
    //declare constructor
    public School() {
        
    }
    
    //declare interface methods
    public void addCourse(Course name) {
        this.courses.add(name);
    }
    
    public int getNumCourses() {
        return courses.size();
    }
    
    public void getCourseInfo(int id) {
        boolean found = false;
        
        for (int i = 0; i < courses.size(); i++) {
            
            if(id == courses.get(i).getCourseID()) {
                System.out.println("The course '" + courses.get(i).getName() + "' has " + courses.get(i).getNumStudents() + " students.");
                System.out.println("The instructor is " + courses.get(i).getProfessor().getName());
                found = true;
            }
           
        }
        if (found ==false) {
            System.out.println("The course " + id + " does not exist");
        }
    }
}
