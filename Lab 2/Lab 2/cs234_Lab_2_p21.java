
/**
 *
 * @author Nicholas Vialpando
 */
import java.util.Scanner;

public class cs234_Lab_2_p21 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        char newE;
        do {
            System.out.print("Please enter year: ");
            int y = in.nextInt();

            int a = y % 19;        
            int b = y / 100;        
            int c = y % 100;        
            int d = b / 4;        
            int e = b % 4;        
            int g = (8 * b + 13) / 25;        
            int h = (19 * a + b - d - g + 15) % 30;        
            int j = c / 4;        
            int k = c % 4;        
            int m = (a + 11 * h) / 319;        
            int r = (2 * e + 2 * j - k - h + m + 32) / 7;        
            int n = (h - m + r + 90) / 25;        
            int p = (h - m + r + n + 19) / 32;

            /*System.out.println("a: " + a);
            System.out.println("b: " + b);
            System.out.println("c: " + c);
            System.out.println("d: " + d);
            System.out.println("e: " + e);
            System.out.println("g: " + g);
            System.out.println("h: " + h);
            System.out.println("j: " + j);
            System.out.println("k: " + k);
            System.out.println("m: " + m);
            System.out.println("r: " + r);
            System.out.println("n: " + n);
            System.out.println("p: " + p);*/

            System.out.println("Easter is on " + n + "/" + p + "/" + y);
            System.out.print("Find Easter for another year(enter y or n)?: ");
            newE = in.next().charAt(0);
        }
        while (newE == 'y' || newE == 'Y');
    }
}
