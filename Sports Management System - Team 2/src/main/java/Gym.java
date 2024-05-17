//imports java utilities
//imports java utilities
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Gym {
    // Private instance variables
    private String name;
    private String location;
    private ArrayList<Customers> members;
    private ArrayList<Classes> classes;
    private ArrayList<Trainers> trainers;
    private ArrayList<PersonalTrainer> ptrainers;
    

    // Constructor
    public Gym(String name, String location) {
        this.name = name;
        this.location = location;
        this.classes = new ArrayList<Classes>();
        this.members = new ArrayList<Customers>();
        this.trainers = new ArrayList<Trainers>();
        this.ptrainers = new ArrayList<PersonalTrainer>();
        
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for location
    public String getLocation() {
        return location;
    }

    // Setter method for location
    public void setLocation(String location) {
        this.location = location;
    }
    //adds customer to member list
    public void addMember(Customers customer){
        members.add(customer);
    }
    
    public void getMembers(){ //need to turn to iterator
        System.out.println("The members of the gym are: ");
        for (int i = 0; i< members.size(); i++){
            System.out.println(members.get(i).getName() +"\n" + "  Membership Cost Per Month: " + members.get(i).getMembershipCost() + "\n" + "  Personal Trainer: " + members.get(i).getTrainer().getName() + ", Specialty: " + members.get(i).getTrainer().getSpecialty());
        }
        System.out.println(""); 
    }
    
    //selecting singular member
    public String selectMember(String theName){
        String result = " ";
        for (int i = 0; i< members.size(); i++)
            if (members.get(i).getName().equals(theName)){//if entered name exists
                return theName;
            }
            else{
                result = "Member does not exist";
                System.out.println(result);//prints out error message if member does not exist
            }
        return result;
    }
    //deletes members
    public void deleteMember(String removeCustomer){
        Iterator<Customers> iter = members.iterator();//iterator for members list
        while(iter.hasNext()){
            if (iter.next().getName().equals(removeCustomer)){//if entered name exists
                iter.remove();//delete customer
                System.out.println("Customer " + removeCustomer + " has been removed");
            }
            else{
                System.out.println("Member does not exist");//prints out error message if member does not exist
            }
        }
    }
    
    //updates member
    public void updateMember (String customerName){
        boolean found = false;
        Iterator<Customers> iter = members.iterator();//iterator to go through members
        while(iter.hasNext()){
            Customers customer = iter.next();
            if (customer.getName().equals(customerName)){//if customer name is found
                found = true;
                System.out.println("Enter new customer name");
                Scanner s1 = new Scanner (System.in);
                String newName = s1.nextLine();
                customer.setName(newName);//sets entered name as the new name
                System.out.println("Customer has been updated to: " + newName + "\n \n");
                break;                
            }                        
        }
        //if name is not in the system
        if(!found){
            System.out.println("Customer " + customerName + " not found.");//prints our error message
        }
    }
    
    //finds personal trainer 
    public PersonalTrainer findTrainer(String trainerName) {
    PersonalTrainer foundTrainer = null; // Initialize with null

    for (PersonalTrainer ptrainer : ptrainers) { 
        if (ptrainer.getName().equals(trainerName)) {
            foundTrainer = ptrainer;
            break; // Exit the loop once a match is found
        }
    }

    return foundTrainer;
}
    
//    public PersonalTrainer findTrainer(String trainerName) {
//        PersonalTrainer foundTrainer = new PersonalTrainer("staff");
//        Iterator<PersonalTrainer> iter = ptrainers.iterator();//creates iterator
//        while(iter.hasNext()){
//            PersonalTrainer ptrainer = iter.next();
//            if (ptrainer.getName().equals(trainerName)){
//                foundTrainer = ptrainer;               
//            }                        
//        }
//        return foundTrainer;
//    }
    
    //deletes trainer 
    public void deleteTrainer(String removeTrainer){
        Iterator<Trainers> iter = trainers.iterator();//creates iterator
        while(iter.hasNext()){
            if (iter.next().getName().equals(removeTrainer)){//if trainer name matches entered name
                iter.remove();//removes from trainer list
                System.out.println("Trainer " + removeTrainer + " has been removed");
            }
            //prints error if name entered doesn't match one in list
            else{
                System.out.println("Personal trainer" + removeTrainer + "does not exist.");
            }
        }
    }
    
    //adds class to the classes arraylist
    public void addClass(Classes className){
        classes.add(className);
    }
    
    //adds trainer to trainers list
    public void addTrainer(Trainers newTrainer){
        trainers.add(newTrainer);
    }
    
    //adds personal trainer to list
    public void addpTrainer(PersonalTrainer newpTrainer){
        ptrainers.add(newpTrainer);
    }
    
    //deletes personal trainer
    public void deletepTrainer(String removepTrainer){
        Iterator<PersonalTrainer> iter = ptrainers.iterator();//creates iterator
        while(iter.hasNext()){
            if (iter.next().getName().equals(removepTrainer)){
                iter.remove();//removes personal trainer
                System.out.println("Personal Trainer " + removepTrainer + " has been removed");
            }
            //error message if personal trainer does not exist
            else{
                System.out.println("Personal Trainer" + removepTrainer + "does not exist");
            }

        }
    }
    
    //gets random trainer 
    public Trainers getTrainer(){
        Random rand = new Random();
        int randomIndex = rand.nextInt(trainers.size());
        return trainers.get(randomIndex);
    }
    
    //gets personal trainer list
    public String getpTrainerList(){
        String result = "Current Gym Personal Trainers: \n";
        for (PersonalTrainer trainerItem : ptrainers){
            result += trainerItem.getName() + "\n" + "  cost: $" + trainerItem.getCost() + "\n" + "  specialty: " + trainerItem.getSpecialty() + "\n";
        }
        System.out.println(""); 
     return result;
    }
    
    //gets trainer list
    public String getTrainerList(){
        String result = "Current Gym Trainers: \n";
        for (Trainers trainerItem : trainers){
            result += trainerItem.getName() + "\n";
        }
        System.out.println(""); 
     return result;
    }
    
    //checks if personal trainer list is empty
    public boolean checkpTrainerListEmpty(){
        boolean isEmpty = ptrainers.isEmpty();
        return isEmpty;
    }
    
    //removes class
    public void removeClass(String className){
        Iterator<Classes> iter = classes.iterator();//creates iterator
        while(iter.hasNext()){
            if(iter.next().getName().equals(className)){//if class exists
                iter.remove();//removes class
                System.out.println(className + " has been removed.\n");
                break;
            }
        }
    }
    
    //gets classes and classes info
    public String getClasses(){
        String result = "Classes at " + name + ":\n";
        for (Classes classItem : classes) {
            result += classItem.getName() + "\n" + "  Cost: $" + classItem.getCost() + "\n" + "  Trainer: " + classItem.getTrainer().getName() + "\n" + classItem.getParticipantList() + "\n" + "Class Start Time: " + classItem.getClassStartTime() + "\n";
        }
        return result;
    }
    
    public Classes getClass2(int index){
        return classes.get(index);
    }
    
    public int selectClass(String theClass){
        int index = 0;
        for (int i = 0; i< classes.size(); i++)
            if (classes.get(i).getName().equals(theClass)){//if entered name exists
                index = i;
                break;
            }
            else{
                index = -1;
            }
        return index;
    }
    
    public void updateTrainer(String trainerName) {
        boolean found = false;
        Iterator<PersonalTrainer> iter = ptrainers.iterator(); // Iterator to go through trainers
        while (iter.hasNext()) {
            PersonalTrainer ptrainer = iter.next();
            if (ptrainer.getName().equals(trainerName)) { // If trainer name is found
                found = true;
                System.out.println("Trainer found: " + trainerName);
                System.out.println("Enter new Trainer name:");
                Scanner s1 = new Scanner(System.in);
                String newName = s1.nextLine();
                ptrainer.setName(newName); // Set the new name
                System.out.println("Enter new Trainer cost:");
                int newCost = s1.nextInt();
                ptrainer.setCost(newCost); // Set the new cost
                System.out.println("Enter new Trainer speciality:");
                s1.nextLine(); // Consume newline
                String newSpecialty = s1.nextLine();
                ptrainer.setSpeciality(newSpecialty); // Set the new speciality
                System.out.println("Enter new trainer start time:");
                s1.nextLine(); // Consume newline
                int startTime = s1.nextInt();
                ptrainer.setStartTime(startTime);
                System.out.println("Enter new trainer start time:");
                s1.nextLine(); // Consume newline
                int endTime = s1.nextInt();
                ptrainer.setEndTime(endTime);
                System.out.println("Trainer has been updated to: " + newName + "\nCost: $" + newCost + "\nSpeciality: " + newSpecialty + "\nStart Time: " + startTime + "\nEnd Time: " + endTime + "\n");
                break;
            }
        }
        // If name is not found in the system
        if (!found) {
            System.out.println("Trainer " + trainerName + " not found.");
        }
    }
}
