
package cs234_project;

/**
 *
 * @author Nicholas Vialpando
 */
public class Customers {
    //creates instance variables
    private String name;
    private String phone;
    private PersonalTrainer trainer; //variable to assign personal trainer
    private Classes exercise;// variable that is a Classes method
    
    //constructor
    public Customers(){
    this.name = "John Doe";
    this.phone = "505-867-5309";
    PersonalTrainer defaultpTrainer = new PersonalTrainer("staff", 30, "fitness");
    this.trainer = defaultpTrainer;
    }// end of Customers constructor
    
    //second constructor
    public Customers(String name, String phone){
        this.name = name;
        this.phone = phone;
        PersonalTrainer defaultpTrainer = new PersonalTrainer("staff", 30, "fitness");
        this.trainer = defaultpTrainer;
    }// end of second constructor
    
    public String getName(){
        return name;
    }// end of getName
    
    public String getPhone(){
        return phone;
    }// end of getPhone
    
    public void setName(String name){
        this.name = name;
    }// end of setName
    
    public void setPhone(String phone){
        this.phone = phone; 
    }// end of setPhone
    
    public Classes getExercise(){        
        return exercise;
    }// end of getExercise
 
    //The point of this is to assign a class form the classes method 
    public void setExercise(Classes exercise){
        this.exercise = exercise;
    }// end of setExerise
    
    //sets personal trainer to customer
    public void setPersonalTrainer(PersonalTrainer newTrainer){
        trainer = newTrainer;
    }
    
    //gets a personal traienr
    public PersonalTrainer getTrainer(){
        return trainer;
    }
    
}
