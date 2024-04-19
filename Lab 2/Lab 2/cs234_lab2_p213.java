
/**
 *
 * @author Nicholas Vialpando
 */
import java.util.Scanner;

public class cs234_lab2_p213 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        char newCalc;
        do {
            System.out.print("Please enter frequency in Hz: ");
            double f = in.nextDouble();

            System.out.print("Please enter capacitor minimum value in F: ");
            double cMin = in.nextDouble();

            System.out.print("Please enter capacitor maximum value in F: ");
            double cMax = in.nextDouble();

            double C = Math.sqrt(cMin * cMax);
            double L = 1 / (Math.pow(2 * Math.PI * f, 2) * C);
            double fMin = 1 / (2 * Math.PI * Math.sqrt(L * cMax));
            double fMax = 1 / (2 * Math.PI * Math.sqrt(L * cMin));

            System.out.println("C: " + C);
            System.out.println("L: " + L);  
            System.out.println(fMin + " Hz < f < " + fMax);
            System.out.print("calculate new fmin & fmax (enter  y or n): ");
            newCalc = in.next().charAt(0);
        }
        while (newCalc == 'y' || newCalc == 'Y');
    }
}
