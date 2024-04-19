
package school;

import java.util.ArrayList;

/**
 * @author Nicholas Vialpando
 * CS 234 - Lab 7
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
        //declare variable to track if course id has been found to break loop
        boolean found = false;
        
        //iterate through loop to check course objects by id element
        for (int i = 0; i < courses.size(); i++) {
            //look for matching element at index i and print out relevant course information
            if(id == courses.get(i).getCourseID()) {
                System.out.println("The course '" + courses.get(i).getName() + "' has " + courses.get(i).getNumStudents() + " students.");
                System.out.println("The instructor is " + courses.get(i).getProfessor().getName());
                found = true;
            }
           
        }
        //check to see if id was not found
        if (found ==false) {
            System.out.println("The course " + id + " does not exist");
        }
    }
}
