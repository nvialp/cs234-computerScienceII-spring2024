

/**
 *
 * @author Nicholas Vialpando
 * 2/13/2024
 * cs 234 - lab 3
 */

import java.util.Scanner;
public class cs234_lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        byte menuSelection;
        int fibNum;
        int perNum;
        int prodNum;
        
        do {
            //creat menu
            System.out.println("1. Get Fibonacci Sequence");
            System.out.println("2. Check Perfect Number");
            System.out.println("3. Find the Product of Digits");
            System.out.println("4. Reverse a Word");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            menuSelection = in.nextByte();
            
            switch (menuSelection) {
                case 1: System.out.print("Enter a positive integer: ");  
                    fibNum = in.nextInt();
                    int term1 = 0, term2 = 1, next;
                    while (fibNum < 1) {
                        System.out.print("Enter a positive integer: ");
                        fibNum = in.nextInt();
                    }                    
                    for (int i = 0; i < fibNum; ++i) {
                        System.out.print(term1 + " ");
                        next = term1 + term2;
                        term1 = term2;
                        term2 = next;
                    }
                    System.out.println();
                    System.out.println();
                    break;
                    
                case 2: System.out.print("Enter a positive integer greater than 1: ");
                    perNum = in.nextInt();
                    int sum = 1;                    
                    while (perNum < 2 || perNum < 0) {
                        System.out.print("Enter a positive integer greater than 1: ");
                        perNum = in.nextInt();
                    }                    
                    if(perNum == 1) {
                        System.out.println(perNum + " is not a perfect number.");
                    }                    
                    else {
                        for(int i = 2; i < perNum; i++) {
                            if(perNum % i == 0) {
                                sum = sum + i;
                            }
                        }
                    }                    
                    if (sum == perNum) {
                        System.out.println(perNum + " is a perfect number.");
                    }
                    else {
                        System.out.println(perNum + " is not a perfect number.");
                    }
                    System.out.println();
                    System.out.println();
                    break;
                    
                case 3: System.out.println("Enter a positive integer with at least two digits: ");
                    prodNum = in.nextInt();
                    int remainder = 1;
                    int product = 1;
                    while (prodNum / 10 == 0 || prodNum < 0) {
                        System.out.print("Enter a positive integer with at least two digits: ");
                        prodNum = in.nextInt();
                    }                    
                    while(prodNum > 0) {
                        remainder = prodNum % 10;
                        product = product * remainder;
                        prodNum = prodNum / 10;
                    }
                    System.out.println("Product of digits is: " + product);
                    System.out.println();
                    System.out.println();
                    break;
                    
                case 4: System.out.print("Enter a word: ");
                    String word = "";
                    String revWord = "";
                    word = in.next();                    
                    for (int i = 0; i < word.length(); i++) {
                        revWord = word.charAt(i) + revWord;
                    }                                        
                    System.out.println("Reversed word is: " + revWord );
                    System.out.println();
                    System.out.println();
                    break;
                    
                case 5: System.out.println("Exiting the program. Goodbye!");
                    System.out.println();
                    System.out.println();
                    break;    
                    
                default: System.out.println("Invalid choice. Please enter a valid option.");
                System.out.println();
                System.out.println();
            }
        }
        while (menuSelection != 5);      
    }
}
