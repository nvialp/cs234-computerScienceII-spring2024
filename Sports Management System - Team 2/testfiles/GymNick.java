
package cs234_project;

/**
 *
 * @author Nicholas Vialpando
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Gym {
    // Private instance variables
    private String name;
    private String location;
    private ArrayList<Customers> members;
    private ArrayList<Classes> classes;
    

    // Constructor
    public Gym(String name, String location) {
        this.name = name;
        this.location = location;
        this.classes = new ArrayList<Classes>();
        this.members = new ArrayList<Customers>();
        
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
    
    public void addMember(Customers customer){
        members.add(customer);
    }
    
    public void getMembers(){
        System.out.println("The members of the gym are: ");
        for (int i = 0; i< members.size(); i++){
            System.out.println(members.get(i).getName());
        }
        System.out.println(""); 
    }
    
    public void deleteMember(String removeCustomer){
        Iterator<Customers> iter = members.iterator();
        while(iter.hasNext()){
            if (iter.next().getName().equals(removeCustomer)){
                iter.remove();
                System.out.println("Customer " + removeCustomer + " has been removed");
            }
        System.out.println("");
        }
    }
    
    // fix me: got a little lost making the update customer method
    public void updateMember (String customerName){
        boolean found = false;
        Iterator<Customers> iter = members.iterator();
        while(iter.hasNext()){
            Customers customer = iter.next();
            if (customer.getName().equals(customerName)){
                found = true;
                System.out.println("Enter new customer name");
                Scanner s1 = new Scanner (System.in);
                String newName = s1.nextLine();
                customer.setName(newName);
                break;                
            }                        
        }
        if(!found){
            System.out.println("Customer " + customerName + " not found.");
        }
    }
    
    public void addClass(Classes className){
        classes.add(className);
    }
    
    public void removeClass(Classes className){
        classes.remove(className);
    }
    
    public void getClasses(){
        System.out.println("The classes at this gym are: " + classes);
    }
}
