
package school;
import java.util.ArrayList;
/**
 * @author Nicholas Vialpando
 * CS 234 - Lab 6
 */
public class Course {
    //declare instance variables
    private int courseID;
    private String name;
    private ArrayList<Student> students = new ArrayList<>();
    private Instructor professor;
    
    //declare constructor
    public Course(int courseId, String name) {
        courseID = courseId;
        this.name = name;
    }
    
    public Course(int courseId, String name, Instructor teacher) {
        courseID = courseId;
        this.name = name;
        this.professor = teacher;
    }
    
    //declare instance methods
    public int getCourseID() {
        return courseID;
    }
    
    public String getName() {
        return name;
    }
    
    public Instructor getProfessor() {
        return professor;
    }
    
    public void setCourseID(int courseId) {
        courseID = courseId;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setProfessor(Instructor instructor) {
        professor = instructor;
    }
    
    public int getNumStudents() {
        return students.size();
    }
    
    public void addStudent(Student student) {
        this.students.add(student);
    }
}
