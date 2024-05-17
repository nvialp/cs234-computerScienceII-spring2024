package cs234_project;

/**
 *
 * @author Nicholas Vialpando
 */
public class PersonalTrainer extends Trainers{
    //creates instance variables
    private int cost;
    private String speciality;
    
    public PersonalTrainer(String name){
        super(name);
        this.cost = 0;
        this.speciality = "beginner fitness";
    }// end of constructor
    
    public PersonalTrainer(String name, int cost, String specialty){
        super(name);
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
}
