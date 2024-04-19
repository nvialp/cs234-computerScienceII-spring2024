package testerhospital;

/**
 * @author Nicholas Vialpando
 * CS 234 - Lab 6
 * 03/04/2024
 */

import java.util.*;
import java.util.ArrayList;

public class Hospital {
    //declare instance variables
    private String name;
    private ArrayList<Doctor> doctors = new ArrayList<>();
    
    //declare constructor
    public Hospital(String name) {
        this.name = name;
    }
    
    //public interface methods
    public void addDoctors(Doctor name) {
        this.doctors.add(name);
    }
    
    //use arraylist shuffle to get a random doctor from the doctors list 
    public Doctor getDoctor() {
        Collections.shuffle(doctors);
        return doctors.get(0);
    }
    
    //method to heal patient.  patient is passed explicitly and then assigned a doctor to add 1 unit of health
    public void healPatient(Soldier patient){
        //inform that patient is at hospital
        System.out.println("The " + patient.getSoldierType() + " is at the hospital");

        //assign doctor
        Doctor aDoctor = getDoctor();
        System.out.println("     Doctor " + aDoctor.getName() + " is taking care of the " + patient.getSoldierType());        
        if(patient.getHealth() > 0) {
            System.out.println("     The patient " + patient.getSoldierType() + " is recovering");
            patient.setHealth(patient.getHealth() + 1);
        }else {
            System.out.println("     There is nothing we can do. The patient " + patient.getSoldierType() + " is already dead");
        }
        
        
       
       
    }
}
