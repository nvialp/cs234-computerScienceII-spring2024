/**
 *
 * @author Nicholas Vialpando
 */
public class gymMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //boolean done = true;
        int choice;
        
        Customers customer = new Customers();
        System.out.println(customer.getName());
        
       
        Trainers trainer = new Trainers("billy bob");
        System.out.println(trainer.getName());
        trainer.setName("William Bob");
        System.out.println(trainer.getName());
        
        
        
        Classes class1 = new Classes ("yoga" ,45);
        class1.getCost();
        class1.addCustomers(customer);
        
        Classes class2 = new Classes ("HIIT", 55);
        class2.getCost();
        class2.getTrainer();
        

        Classes class3 = new Classes("cycling", 50);
        class3.getTrainer();
        
        
        do{
            System.out.println("Database system\n"
                + "1. Open gym: \n"
                + "2. Set Gym Name: \n"
                + "3. Exit Gym");
            
            choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.println(gym.getName() + "Main Menu");
                    do{
                        System.out.println("Database system\n"
                        + "1. Add New Customer: \n"
                        + "2. Delete Customer: \n"
                        + "3. Update Customer Information: \n"
                        + "4. Add Class \n"
                        + "5. View Classes: \n"
                        + "6. Delete Class: \n"        
                        + "7. Exit the Program \n");
                        
                    choice = scanner.nextInt();
                    switch(choice){
                        case 1:
                            System.out.println("Add new Customer");

                            Customers c1 = new Customers();
                            Scanner sc1 = new Scanner(System.in);
                            System.out.println("Please enter name ");
                            String name = sc1.next();
                            c1.setName(name);

                            Scanner sc2 = new Scanner (System.in);
                            System.out.println("Please enter phone number");
                            String phone = sc2.next();
                            c1.setPhone(phone);

                            //fixme:  method to add customer to gym arraylist

                            break;
                        case 2:
                            System.out.println("Delete Customer");
                            //fixme:  method to delete customer by name from gym arraylist

                            break;
                        case 3:
                            System.out.println("Update Customer Information");
                            break;
                        case 4:
                            System.out.println("Add Class");
                            /*fixme:    submenu 1. Set class
                                            System.out.println("Please enter class name"); //adds name as well as adds class to gym arraylist
                                            gym.addClass(); //adds class to gym arraylist
                            
                                            System.out.println("Please enter class cost"); //adds cost
                                            
                                            System.out.println("please enter trainer name"); //adds trainer
                            
                                        submenu 2. add customers
                                            System.out.println("Please enter customer to add by name")
                                            Customer = scanner.next()
                                                gym.addCustomer(Customer) //adds customer to Classes array list
                                            delete customer*/  
                            break;
                            
                        case 5:
                            System.out.println("View Classes");
                            System.outprintln(gym.getClasses()); //add getClasses method to Gym class
                            break;
                        
                        case 6:
                            System.out.println("Delete Class");
                            System.out.println(gym.getClasses()); //show list of classes
                            System.out.println("Please enter name of class to delete");
                            gym.deleteClass(name);
                            break;
                            
                        case 7:
                            System.out.println("Exiting Gym, Goodbye!");
                            break;
                            
                        default:
                            System.out.println("Invalid choice, please try again");
                        }
                    }// end of gym main menu
                    while(choice != 7);
                    
                    break;
                    
                case 2:
                    System.out.println("Enter Gym Name");

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


