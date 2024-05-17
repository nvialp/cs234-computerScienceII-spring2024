package cs234_project;

/**
 *
 * @author Nicholas Vialpando
 */
//imports utilities
import java.util.Iterator;
import java.util.Scanner;
import java.util.Random;

public class Cs234_project {

    //creates main class
    public static void main(String[] args) {

        //creates scanner for user input
        Scanner scanner = new Scanner(System.in);
        //creates variable to store input
        int choice;

        //creates new Gym object GunsNPoses
        Gym GunsNPoses = new Gym("Guns N' Poses", "123 W Street");

        Customers first = new Customers("John doe", "505-555-5555");
        Customers second = new Customers("Jane doe", "575-555-5555");
        Customers third = new Customers("Phillip Nice", "565-555-5555");
        Customers customer1 = new Customers("Seymour Butz", "346-598-5569");
        Customers customer2 = new Customers("Lenny Landry", "386-698-4455");

        GunsNPoses.addMember(first);
        GunsNPoses.addMember(second);
        GunsNPoses.addMember(third);
        GunsNPoses.addMember(customer1);
        GunsNPoses.addMember(customer2);

        Classes class1 = new Classes("yoga", 45);
        Classes class2 = new Classes("HIIT", 55);
        Classes class3 = new Classes("cycling", 50);
        class1.addCustomers("nick");
        class1.addCustomers("sarah");
        System.out.println(class1.getParticipantList());
        
        GunsNPoses.addClass(class1);
        GunsNPoses.addClass(class2);
        GunsNPoses.addClass(class3);
        GunsNPoses.getClass2(0).addCustomers("eli");
        System.out.println(GunsNPoses.getClass2(0).getName());
        System.out.println(class1.getParticipantList());

        do {
            //prints out menu for the gym
            System.out.println(GunsNPoses.getName() + " Main Menu \n"
                    + "1. Add New Customer: \n"
                    + "2. Delete Customer: \n"
                    + "3. Update Customer Information: \n"
                    + "4. Add Class \n"
                    + "5. View Classes: \n"
                    + "6. Delete Class: \n"
                    + "7. View Gym Members: \n"
                    + "8. View Trainers \n"
                    + "9. Add Trainer \n"
                    + "10. Add Personal Trainer \n"
                    + "11. Delete Trainer \n"
                    + "12. Delete Personal Trainer \n"
                    + "13. Exit Gym \n");
            //prompts user to select an option
            System.out.print("Please make selection: ");
            //saves the input in int variable choice
            choice = scanner.nextInt();

            switch (choice) {
                //if user picks 1
                case 1:
                    //shows the menu option chosen
                    System.out.println("Add new Customer");
                    //creates new scanner, saves user input as String variable name
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Please enter name ");
                    String name = sc1.nextLine();

                    //creates new customer and sets the name to the name entered
                    Customers newCustomer = new Customers();
                    newCustomer.setName(name);

                    //creates scanner, prompts user to enter phone number, saves phone number, sets phone number
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Please enter phone number");
                    String phone = sc2.next();
                    newCustomer.setPhone(phone);

                    System.out.println("Add personal Trainer?");//prints option for personal trainer

                    do {
                        //prints out option to add a personal trainer or go back to main menu
                        System.out.println("Database system\n"
                                + "1. Add personal trainer: \n"
                                + "2. Save Customer and exit: \n");

                        //prompts user to make selection and saves selection
                        System.out.print("Please make selection: ");
                        choice = scanner.nextInt();
                        switch (choice) {
                            case 1:
                                //if a personal trainer is chosen and there are no personal trainers
                                if (GunsNPoses.checkpTrainerListEmpty()) {
                                    //prompts user to enter personal trainer information and saves input
                                    System.out.println("Please enter personal trainer name");
                                    String pTrainerName = scanner.next();
                                    System.out.println("Please enter personal trainer cost");
                                    int cost = scanner.nextInt();
                                    System.out.println("Please enter personal trainer specialty");
                                    String specialty = scanner.next();
                                    //creates new personal trainer from user input
                                    PersonalTrainer newPTrainer = new PersonalTrainer(pTrainerName, cost, specialty);
                                    //sets personal trainer to customer
                                    newCustomer.setPersonalTrainer(newPTrainer);
                                    //adds new customer to member arraylist
                                    GunsNPoses.addMember(newCustomer);
                                    //adds new personal trainer to personal trainer array list 
                                    GunsNPoses.addpTrainer(newPTrainer);
                                } //if there are personal trainers
                                else {
                                    //returns personal trainer list and prompts user to enter the personal trainer being assigned
                                    System.out.println(GunsNPoses.getpTrainerList());
                                    System.out.println("Please enter name of trainer to assign to customer");
                                    String trainerName = scanner.next();
                                    //sets personal trainer to new customer
                                    newCustomer.setPersonalTrainer(GunsNPoses.findTrainer(trainerName));
                                    //adds new customer to gym member array list
                                    GunsNPoses.addMember(newCustomer);
                                }
                                break;
                            //if option 2 to return to main menu is chosen
                            case 2:
                                PersonalTrainer staff = new PersonalTrainer("Staff");//initialize staff personal trainer to avoid null
                                newCustomer.setPersonalTrainer(staff);
                                //adds new customer to gym member arraylist and exits
                                GunsNPoses.addMember(newCustomer);
                                System.out.println("Saving exiting");
                                break;

                            default:
                                //error message if invalid input
                                System.out.println("Please choose a valid option.");

                        }
                    } while (choice != 2);
                    break;
                //option 2 of main menu    
                case 2:
                    System.out.println("Delete Customer");
                    //creates scanner and prompts user to enter the customer to be removed and saves input
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Enter Customer to be Removed");
                    String removeCustomer = sc3.nextLine();
                    //calls method to delete the customer
                    GunsNPoses.deleteMember(removeCustomer);
                    break;
                //option 3 of main menu
                case 3:
                    System.out.println("Update Customer Information");
                    //gets members of gym
                    GunsNPoses.getMembers();
                    //prompts customer to enter the customer to be updated and saves input
                    System.out.println("Enter Customer to Update: ");
                    Scanner sc4 = new Scanner(System.in);
                    String updatedCustomer = sc4.nextLine();
                    //calls method to update the customer
                    GunsNPoses.updateMember(updatedCustomer);
                    break;
                //option 4 of main menu    
                case 4:
                    System.out.println("Add Class");

                    System.out.println("Please enter class name"); //adds name as well as adds class to gym arraylist
                    Scanner sc7 = new Scanner(System.in);
                    String newName = sc7.next();

                    System.out.println("Please enter class cost"); //adds cost to class
                    Scanner sc8 = new Scanner(System.in);
                    int cost = sc8.nextInt();
                    Classes newClass = new Classes(newName, cost);
                    GunsNPoses.addClass(newClass);//adds class to gym
                    //prompts user to add trainer to the class 
                    System.out.println("Please add Trainer Name");
                    Scanner sc9 = new Scanner(System.in);
                    String trainerName = sc9.nextLine();
                    //creates new trainer from  user input
                    Trainers newTrainer = new Trainers(trainerName);
                    GunsNPoses.addTrainer(newTrainer); //add trainer to trainers arraylist
                    newClass.setTrainer(newTrainer); //set trainer for class
                    break;
                //option 5 of main menu
                case 5:
                    System.out.println("View Classes");
                    System.out.println(GunsNPoses.getClasses() + "\n");//prints out list of classes

                    do {
                        //prints out option to add a personal trainer or go back to main menu
                        System.out.println("Add customer to class? \n"
                                + "1. Add customer to a class: \n"
                                + "2. Exit: \n");

                        //prompts user to make selection and saves selection
                        System.out.print("Please make selection: ");
                        choice = scanner.nextInt();
                        switch (choice) {
                            case 1:
                                //if customer neeeds to be put into a class
                                GunsNPoses.getMembers();

                                System.out.println("Enter member name to be added: ");
                                Scanner sc13 = new Scanner(System.in);
                                String theName = sc13.nextLine();
                                GunsNPoses.selectMember(theName);//finds if member exists

                                System.out.println("Enter class to add customer to: ");

                                Scanner sc14 = new Scanner(System.in);
                                String theClass = sc14.nextLine();
                                int index = GunsNPoses.selectClass(theClass);

                                //FIX ME: needs way to add the customer to the participants list?
                                if (index > 0) {                                        
                                    GunsNPoses.getClass2(index).addCustomers(theName);
                                } else {
                                    System.out.println("Class does not exist");
                                }

                                break;
                            //if option 2 to return to main menu is chosen
                            case 2:

                                System.out.println("Saving exiting");
                                break;

                            default:
                                //error message if invalid input
                                System.out.println("Please choose a valid option.");
                        }
                    } while (choice != 2);

                    break;
                //option 6 of main menu     
                case 6:
                    System.out.println("Delete Class");
                    System.out.println(GunsNPoses.getClasses()); //show list of classes
                    System.out.println("Please enter name of class to delete");
                    Scanner sc10 = new Scanner(System.in);
                    String className = sc10.next();
                    GunsNPoses.removeClass(className); //removes selected class from class 
                    break;
                //option 7 of main menu   
                case 7:
                    System.out.println("View Members");
                    GunsNPoses.getMembers();//returns list of members
                    break;
                //option 8 of main menu     
                case 8:
                    System.out.println("View Trainers");
                    System.out.print(GunsNPoses.getTrainerList() + "\n");//returns list of regular trainers
                    System.out.print(GunsNPoses.getpTrainerList() + "\n");//returns list of personal trainers
                    break;
                //option 9 of main menu    
                case 9:
                    System.out.println("Add Trainer");
                    System.out.print("Enter trainer name: ");
                    Scanner sc11 = new Scanner(System.in);
                    String newTrainerName = sc11.next();//saves trainer name
                    Trainers addTrainer = new Trainers(newTrainerName); //creates new trainer
                    GunsNPoses.addTrainer(addTrainer);//adds to list of trainers
                    break;
                //option 10  of main menu    
                case 10:
                    System.out.println("Add Personal Trainer");
                    System.out.print("Enter personal trainer name: ");//prompts for personal trainer name
                    Scanner sc12 = new Scanner(System.in);
                    String newpTrainerName = sc12.next();
                    System.out.println("Enter personal trainer cost per hour: ");//prompts for personal trainer cost
                    Scanner sc13 = new Scanner(System.in);
                    int pTrainerCost = sc13.nextInt();
                    System.out.println("Enter personal trainer specialty: ");//prompts for personal trainer specialty
                    Scanner sc14 = new Scanner(System.in);
                    String pTrainerSpecialty = sc14.next();
                    //creates new personal trainer
                    PersonalTrainer addpTrainer = new PersonalTrainer(newpTrainerName, pTrainerCost, pTrainerSpecialty);
                    GunsNPoses.addpTrainer(addpTrainer);//adds personal trainer to personal trainer list
                    break;
                //option 11 of main menu    
                case 11:
                    System.out.println("Delete Trainer");
                    System.out.print(GunsNPoses.getTrainerList() + "\n"); //display all trainers

                    System.out.println("Please enter name of trainer to remove: ");//prompts to enter trainer name
                    Scanner sc15 = new Scanner(System.in);
                    String deleteTrainer = sc15.next();
                    GunsNPoses.deleteTrainer(deleteTrainer);//deletes trainer
                    System.out.println(deleteTrainer + " has been removed");
                    System.out.print(GunsNPoses.getTrainerList() + "\n");//gets trainer list
                    break;
                //option 12 of main menu    
                case 12:
                    System.out.println("Delete Personal Trainer");
                    System.out.print(GunsNPoses.getpTrainerList() + "\n"); //prints personal trainer list
                    System.out.println("");

                    System.out.println("Please enter name of personal trainer to remove: ");//prompts user for personal trainer to delete
                    Scanner sc16 = new Scanner(System.in);
                    String deletepTrainer = sc16.next();
                    GunsNPoses.deletepTrainer(deletepTrainer);//deletes personal trainer
                    System.out.println(deletepTrainer + " has been removed");
                    System.out.print(GunsNPoses.getpTrainerList() + "\n");//returns personal trainer list
                    break;
                //option 13 of main menu    
                case 13:
                    System.out.println("Exiting Gym, Goodbye!");//exit message
                    break;
                //error message in case of invalid entry    
                default:
                    System.out.println("Invalid choice, please choose valid option.");
            }
        }// end of gym main menu
        while (choice != 13);
    }

}
