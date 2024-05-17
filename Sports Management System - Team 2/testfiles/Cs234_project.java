
package cs234_project;

/**
 *
 * @author Nicholas Vialpando
 */

import java.util.Scanner;
import java.util.Random;
//import java.util.Iterator;
//import java.util.ArrayList;
public class Cs234_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //boolean done = true;
        int choice;
        
        Gym GunsNPoses = new Gym ("Guns N' Poses", "123 W Street");
        
        /*Customers customer1 = new Customers("Seymour Butz", "346-598-5569");
        System.out.println(customer1.getName());
        Customers customer2 = new Customers("Lenny Landry", "386-698-4455");
        System.out.println(customer2.getName());
       
        Trainers trainer = new Trainers("billy bob");
        System.out.println(trainer.getName());
        trainer.setName("William Bob");
        System.out.println(trainer.getName());
        
        //PersonalTrainer ptrainer = new PersonalTrainer("Jillian McGee");
        //ptrainer.setCost(45);
        //ptrainer.setSpecialty("Hot Yoga"); tyring to set specialty
        
        
        
        
        Classes class1 = new Classes ("yoga" ,45);
        class1.getCost();
        class1.addCustomers(customer1);
        GunsNPoses.addClass(class1);
        
        Classes class2 = new Classes ("HIIT", 55);
        class2.getCost();
        class2.getTrainer();
        GunsNPoses.addClass(class2);
        

        Classes class3 = new Classes("cycling", 50);
        class3.getTrainer();
        GunsNPoses.addClass(class3);*/

        
        
        do{
            System.out.println("Database system\n"
                + "1. Open gym: \n"
                + "2. Set Gym: \n"
                + "3. Exit System");
            
            System.out.print("Please make selection: ");
            choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    do{
                        System.out.println(GunsNPoses.getName() + " Main Menu \n"
                        + "1. Add New Customer: \n"
                        + "2. Delete Customer: \n"
                        + "3. Update Customer Information: \n"
                        + "4. Add Class \n"
                        + "5. View Classes: \n"
                        + "6. Delete Class: \n"  
                        + "7. View Gym Members: \n"        
                        + "8. Exit the Gym \n");
                     
                    System.out.print("Please make selection: ");    
                    choice = scanner.nextInt();
                    
                    switch(choice){
                        case 1:
                            System.out.println("Add new Customer");

             
                            Scanner sc1 = new Scanner(System.in);
                            System.out.println("Please enter name "); 
                            String name = sc1.next();
                            Customers newCustomer = new Customers();
                            newCustomer.setName(name);

                            Scanner sc2 = new Scanner (System.in);
                            System.out.println("Please enter phone number");
                            String phone = sc2.next();
                            newCustomer.setPhone(phone);
                            GunsNPoses.addMember(newCustomer);
                            //fixme:  method to add customer to gym arraylist
                            break;
                            
                        case 2:
                            System.out.println("Delete Customer");
                            Scanner sc3 = new Scanner (System.in);
                            System.out.println("Enter Customer to be Removed");
                            String removeCustomer = sc3.next();
                            GunsNPoses.deleteMember(removeCustomer);
                            break;
                            
                        case 3:
                            System.out.println("Update Customer Information");                            
                            GunsNPoses.getMembers();
                            System.out.println("Enter Customer to Update");
                            Scanner sc4 = new Scanner (System.in);
                            String updatedCustomer = sc4.nextLine();
                            System.out.println(updatedCustomer);
                            GunsNPoses.updateMember(updatedCustomer);
                            
                            break;
                        case 4:
                            System.out.println("Add Class");
                            
                            System.out.println("Please enter class name"); //adds name as well as adds class to gym arraylist
                            Scanner sc7 = new Scanner (System.in);
                            String newName = sc7.next();

                            System.out.println("Please enter class cost"); //adds cost
                            Scanner sc8 = new Scanner (System.in);
                            int cost = sc8.nextInt();

                            Classes newClass = new Classes(newName, cost);

                            GunsNPoses.addClass(newClass); 
                            break;
                            
                        case 5:
                            System.out.println("View Classes");
                            GunsNPoses.getClasses();
                            do {
                                System.out.println("Trainer information\n"
                                        + "1. View Trainers: \n"
                                        + "2. Add Trainers: \n"
                                        + "3. Delete Trainer: \n"  // we don't have anywhere to view and delete trainer info so I stuck it here
                                        + "4. Go back \n");

                                choice = scanner.nextInt();
                                switch (choice) {
                                    case 1:
                                        //System.out.println(Classes.trainers.getTrainers());
                                        //System.out.println(class1.getTrainer().getName());
                                        break;
                                    case 2:// add trainer
                                        break;
                                    case 3:// delete trainer
                                        break;
                                    case 4:// going back
                                        break;
                                    default:
                                        System.out.println("Try a valid option");
                                } // end of switch
                                
                            } while (choice != 4);
                            break;
                            
                        case 6:
                            System.out.println("Delete Class");
                            GunsNPoses.getClasses(); //show list of classes
                            System.out.println("Please enter name of class to delete");
                            Scanner sc9 = new Scanner (System.in);
                            String className= sc9.next();
                           // GunsNPoses.removeClass(Classes className); fix me: needs to remove the selected class from classes list
                            break;
                            
                        case 7:
                            GunsNPoses.getMembers();
                            break;    
                            
                        case 8:
                            System.out.println("Exiting Gym, Goodbye!");
                            break;
                            
                        default:
                            System.out.println("Invalid choice, please try again");
                        }
                    }// end of gym main menu
                    while(choice != 8);                    
                    break;
                    
                case 2:
                    System.out.println("Enter Gym Name");
                    String gymName = scanner.next();
                    GunsNPoses.setName(gymName);
                    
                    System.out.println("Enter Gym Location");
                    String gymLocation = scanner.next();
                    GunsNPoses.setLocation(gymLocation);
                    
                    System.out.println("Gym name has been updated to: " + GunsNPoses.getName());
                    System.out.println("Gym location has been updated to: " + GunsNPoses.getLocation());
                    break;
                    
                case 3:
                    System.out.println("Exiting Management System, Goodbye!");
                    break;
                    
                default:
                    System.out.println("Invalid choice, please try again");
            }  
        }//end of database menu
        while(choice != 3);
    }
}
