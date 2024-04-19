
package testerhospital;

/**
 * @author Nicholas Vialpando
 * CS 234 - Lab 6
 * 03/04/2024
 */
import java.util.*;
public class Soldier {
    //declare instance variables
    private int health; //variable used to track soldier health
    private String soldierType; //defining soldier by type
    private ArrayList<String> weapons;//arraylist to hold soldier loadout
    
    //declare constructors
    public Soldier() {
        this.health = 10;
        this.soldierType = "Grunt";
        this.weapons = new ArrayList<>();
    }
    
    //constructor to initialize health and type
    public Soldier(int hp, String type) {
        this.health = hp;
        this.soldierType = type;
        this.weapons = new ArrayList<>();
    }

    //public interface methods
    public int getHealth() {
        return health;
    }
    
    //method to return soldier object
    public String getSoldierType() {
        return soldierType;
    }
    
    //method to manually set soldier health
    public void setHealth(int newHealth) {
        this.health = newHealth;
    }
    
    //method to manually set soldier type instead of default
    public void setSoldierType(String type) {
        this.soldierType = type;
    }
    
    /**
     * enemy soldier health reduced by 1
     * if enemy health reaches 0, enemy is dead
     * @param enemy 
     */
    public void shootEnemy(Soldier enemy) {
        //announce soldier has shot enemy
        System.out.println("The " + soldierType + " shoots at the " + enemy.getSoldierType());
        //reduce soldier health by 1
        enemy.setHealth(enemy.getHealth() - 1);
        //check if soldier is dead
        if(enemy.getHealth() <= 0) {
            System.out.println("     The " + enemy.getSoldierType() + " is dead"); 
        }
    }
    
    public void addWeapon(String weapon) {
        //use array list.add method to add new weapon
        this.weapons.add(weapon);
    }
    
    //method for giving list of weapons
    public ArrayList<String> getWeapons(){
        return this.weapons;
    }
    
    //method to override toString with custom info on soldier object
    public String toString() {
        return "The " + this.soldierType + " has a health of " + this.health + " and has the following weapons: " + this.getWeapons();
    }
}
