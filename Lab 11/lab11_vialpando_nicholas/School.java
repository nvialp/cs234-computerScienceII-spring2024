
/**
 *
 * @author Nicholas Vialpando
 * CS 234 - Lab 11
 */

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class School {
    //declare instance variables
    private Map<String, Student> students = new HashMap<>();
    
    //declare constructor
    public void addStudent(String sid, String name, String major){
        Student newStudent = new Student(sid, name, major);
        generateGrades(newStudent, 0.00, 100.00);
        students.put(sid, newStudent);
    }    
    
    //declare instance methods
    public void generateGrades(Student s, double min, double max){
        Random random = new Random();
        double sum = 0;
        double average;
        for(int i = 0; i < 5; i++){
            s.storeGrade(random.nextDouble(100));
        }
        min = Collections.min(s.getGrades());
        max = Collections.max(s.getGrades()); 
        for(int i = 0; i < 5; i++){
            sum += s.getGrades().get(i);
        }
        
        average = sum / 5;
        System.out.printf("%.2f", average);
    }
    
    public void getStudentInfo(String sid){
        if(students.get(sid) == null){
            System.out.print("There is no student with the id " + sid);
        }
        else{
           System.out.println("Student's ID: " + students.get(sid).getSid() + "\n" + "Student's name: " + students.get(sid).getName() + "\n" + "Student's major: " + students.get(sid).getMajor() + "\n" + "Student's grades: " + students.get(sid).getGrades()); 
           
           System.out.printf("%.2f", students.get(sid).getGrades());
           //System.out.println("Student's average: " + );
        }        
    }
}
