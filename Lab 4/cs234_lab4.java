/**
 *
 * @author Nicholas Vialpando
 * 2/19/2024
 * cs 234 - lab 3
 */

import java.util.Scanner;
public class cs234_lab4 {
    /** 
     * This method gets the user input for the string 
     * and calls countA() 
     */ 
    public static void reg_option1() {
        Scanner in = new Scanner(System.in);
        String input;
        
        System.out.println("Write the string.");
        input = in.next();
        
        System.out.println("There are: " + countA(input) + " a's.");
    }
   
    /** 
     * The method takes a String and returns the number of lower-case letters 'a' 
     * in the string. Do not use the count() built-in method. 
     * @param s, the string 
     * @return the count 
     */ 
    public static int countA(String s) {
        byte count = 0; //initialize counter to track a's in string
        
        for (int i = 0; i < s.length(); i++) {  //iterate through string
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') { //check for both cases of a
                count += 1;
            }
        }
        return count;
    }
    
    /** 
     * This method gets the input string, the target character 
     * and the new character, then it calls replace() and 
     * prints the new string 
     */ 
    public static void reg_option2() {
        Scanner in = new Scanner(System.in);
        String input;
        char targetChar;
        char newChar;
        
        System.out.println("Write the string.");
        input = in.next();
        
        System.out.println("Write the target character.");
        targetChar = in.next().charAt(0);
        
        System.out.println("Write the new character.");
        newChar = in.next().charAt(0);
        
        System.out.println(replace(input, targetChar, newChar));        
    }       
    
    /** 
     * The method takes a string and two characters and returns a string in which 
     * every occurrence of the first character is replaced by the second one. 
     * Do not use the .replace() built-in method. 
     * @param s, the string * @param a, the first character 
     * @param b, the second character
     * @return a new string 
     */ 
    public static String replace(String s, char a, char b) {
        String newS = "";
        
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == a) {
                newS += b; //check for target letter and add to new string
            }
            else {
                newS += s.charAt(i);  //append new string with current character from s 
            }
        }
        return newS;
    }
            
    /** 
     * This method gets input for the String and the target character 
     * Then, it calls the recursive method containsCharacter() and 
     * it prints the result (true or false) 
     */ 
    public static void rec_option1() {
        Scanner in = new Scanner(System.in);
        String input;
        char targetChar;
        
        System.out.println("Write the string.");
        input = in.next();
        
        System.out.println("Write the target character.");
        targetChar = in.next().charAt(0);
        
        System.out.println(containsCharacter(input, targetChar));
    }
            
    /** 
     * Recursive method 
     * Returns True or False if the target character exists in the string 
     * @param str (string) 
     * @param target (char) 
     * @return true or false (boolean) 
     */ 
    public static boolean containsCharacter(String str, char target) {        
        if(str.length() < 1) {
            return false;
        }
        
        else if(str.charAt(0) == target) {
            return true;
        }
        
        else {
            return(containsCharacter(str.substring(1), target)); //initialize recursive function to call on itself with modified parameter
        }        
    }
            
    /** 
     * Method to present the initial Menu with 3 options: 
     * 1. Regular Methods, 2. Recursive Methods, 3. Quit 
     * The menu uses a Switch statement. 
     * For case 1, it calls the method MenuRegular() 
     * For case 2, it calls the method MenuRecursive() 
     * For case 3, it exits * (see the examples) 
     */ 
     public static void Menu() {
         Scanner in = new Scanner(System.in);
         byte menuSelection;         
         
         //create main munu
         do {
             System.out.println("***********************");
             System.out.println("| Main Menu:          |");
             System.out.println("| 1. Regular Methods  |");
             System.out.println("| 2. Recursive Methods|");
             System.out.println("| 3. Quit             |");
             System.out.println("***********************");
             
             System.out.print("Enter your choice: ");
             menuSelection = in.nextByte();
             System.out.println("");  //added a line for readability
             
             switch(menuSelection) {
                 case 1: MenuRegular();
                 break;
                 
                 case 2: MenuRecursive();
                 break;
                 
                 case 3: System.out.println("Exiting the program. Goodbye!");
                 break;
                 
                 default: System.out.println("Invalid choice.  Please try again.");
             }
         }
         while(menuSelection != 3);
     }
                
    /** 
     * Method to present the options for the Regular Methods 
     * 1. Count number of As, 2. Replace target character,
     * 3. Return Main * The method uses a switch statement to call the corresponding 
     * method. 
     * If the user selects option 3, the general Menu should be displayed 
     * (see the examples) 
     */ 
    public static void MenuRegular() {
        Scanner in = new Scanner(System.in);
        byte regMenuSelection;
        
        do {
            System.out.println("******************************");
            System.out.println("| Regular Menu:              |");
            System.out.println("| 1. Count number of A's     |");
            System.out.println("| 2. Replace target character|");
            System.out.println("| 3. Return to main munu     |");
            System.out.println("******************************");
        
            System.out.print("Enter your choice: ");
            regMenuSelection = in.nextByte();
            System.out.println("");
            
            switch(regMenuSelection) {
                 case 1: reg_option1();
                 break;
                 
                 case 2: reg_option2();
                 break;
                 
                 case 3:; //option 3 is the loop exit condition, do not call main menu, exiting this loop will automatically go back previous caller
                 break;
                 
                 default: System.out.println("Invalid choice.  Please try again.");
            }
        }
        while(regMenuSelection != 3);            
    }

    /** 
     * Method to present the options for the Recursive Methods 
     * 1. Search Character, 2. Return Main 
     * The method uses a switch statement to call the corresponding 
     * method. 
     * If the user selects option 2, the general Menu should be displayed 
     * (see the examples) 
     */ 
    public static void MenuRecursive() {
        Scanner in = new Scanner(System.in);
        byte recMenuSelection;
        
        do {
            System.out.println("***************************");
            System.out.println("| Recursive Menu:         |");
            System.out.println("| 1. Search character     |");
            System.out.println("| 2. Return to main menu  |");
            System.out.println("***************************");
            
            System.out.print("Enter your choice: ");
            recMenuSelection = in.nextByte();
            System.out.println("");
            
            switch(recMenuSelection) {
                 case 1: rec_option1();
                 break;
                 
                 case 2:;
                 break;
                 
                 default: System.out.println("Invalid choice.  Please try again.");
            }
        }
        while(recMenuSelection != 2);
    }
            
    public static void main(String[] args) {
        Menu();
    }    
}
