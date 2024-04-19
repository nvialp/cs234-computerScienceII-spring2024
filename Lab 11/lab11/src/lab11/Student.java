package lab11;
/**
 *
 * @author Nicholas Vialpando
 * CS 234 - Lab 11
 */

import java.util.ArrayList;
public class Student {
    //declare instance variables
    private String sid;
    private String name;
    private String major;
    private ArrayList<Double> grades = new ArrayList<>(5);
    
    //declare constructor
    public Student(String sid, String name, String major){
        this.sid = sid;
        this.name = name;
        this.major = major;        
    }
    
    //declare instance methods
    public String getSid(){
        return sid;
    }
    
    public String getName(){
        return name;
    }
    
    public String getMajor(){
        return major;
    }
    
    public ArrayList<Double> getGrades(){
        return grades;
    }
    
    public void storeGrade(Double grade){
        grades.add(grade);
    }
}
