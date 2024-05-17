
import java.util.Iterator;
import java.util.Scanner;


/**
 *
 * @author Rhett
 */
public class PersonalTrainer extends Trainers{
    //creates instance variables
    private int cost;
    private String speciality;
    
    //default constructor with 9-5 work times
    public PersonalTrainer(String name){
        super(name, 9, 17);
        this.cost = 0;
        this.speciality = "beginner fitness";
    }// end of constructor
    
    //default constructor with 9-5 times but setting cost and specialty
    public PersonalTrainer(String name, int cost, String specialty){
        super(name, 9, 17);
        this.cost = 0;
        this.speciality = "beginner fitness";
    }// end of constructor
    
    public PersonalTrainer(String name, int start, int end, int cost, String specialty){
        super(name, start, end);
        this.cost = cost;
        this.speciality = specialty;
    }// end of constructor
    
    
    public int getCost(){
        return cost;
    }// end of getCost
 
    public void setCost(int cost){
        this.cost = cost;
    }// end of setCost
    
    public String getSpecialty(){
        return speciality;
    }// end of getSpeciality 
    
    public void setSpeciality(String speciality){
        this.speciality = speciality;
    }// end of setSpeciality 
    
    /*public int updateCustomerCost(String name){
        int newCost;
        //fixme: add method to look up customer by name, then update cost by adding personal trainer cost to gym membership cost
        
        return newCost;
    }*/
}