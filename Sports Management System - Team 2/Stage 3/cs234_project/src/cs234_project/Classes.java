
package cs234_project;

/**
 *
 * @author Nicholas Vialpando
 */

//imports java utilities
import java.util.ArrayList;
import java.util.Random;
public class Classes {
    //creates private instance variables
    private String name;
    private int cost;
    private Trainers trainer;
    private ArrayList<Trainers> trainers;
    private ArrayList<String> participants;
    
    //constructor
    public Classes(String name, int cost){
        this.name = name;
        this.cost = cost;
        this.participants = new ArrayList<>();
        Trainers defaultTrainer = new Trainers("staff");
        this.trainer = defaultTrainer;
        this.trainers = new ArrayList<>();
    }// end of constructor
    
    //sets trainer for the class
    public void setTrainer(Trainers newTrainer){
        trainer = newTrainer;
    }
    
    //returns the trainer for the class
    public Trainers getTrainer(){
        return trainer;
    }
    
    public Trainers getTrainer2(){
        Random rand = new Random();
        int randomIndex = rand.nextInt(trainers.size());
        return trainers.get(randomIndex);
    }
      public void addTrainer(Trainers trainer) {
        trainers.add(trainer);
    }
      
    //adds customer to class 
    public void addCustomers(String customerName){
        participants.add(customerName);
    }

    public String getParticipantList() {
        //return participants;
        String result = "  Class Participants: \n";
        //System.out.println("Class Participants: ");
        for (String participantName : participants){
            result += "  " + participantName + "\n";
            //System.out.println(participantName);
        }
        return result;
    }
    
    //returns class cost
    public int getCost(){
        return cost;
    }// end of getCost
    
    //sets class cost
    public void setCost(int cost){
        this.cost = cost;
    }// end of setCost
    
    //gets class name
    public String getName(){
        return name;
    }// end of getName
    
    //sets class name
    public void setName(String name){
        this.name = name;
    }// end of setName
    
    //prints classes info
    public String toString(){
        String output = "The " + this.name + " class costs $" + this.cost + 
                " and has the following instructor: " + trainer;
        return output;
    }
}
