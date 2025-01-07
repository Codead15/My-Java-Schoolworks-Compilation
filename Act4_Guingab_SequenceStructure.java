//Guingab_Sequence

package Act4_Guingab_SequenceStructure;


import java.util.Scanner;

public class Act4_Guingab_SequenceStructure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("COMPUTE THE FINAL GRADE AVERAGE\n\n");

        System.out.print("Enter grade for prelim: ");
        int Grade_prelim = input.nextInt();

        System.out.print("Enter grade for Midterm: ");
        int Grade_midterm = input.nextInt();

        System.out.print("Enter grade for Finals: ");
        int Grade_final = input.nextInt();

        double Grade_total = Grade_prelim + Grade_midterm + Grade_final;
        double Grade_average = (double) Grade_total / 3.0; // Convert to double before dividing

        System.out.println("\nThe grade for prelim is: " + Grade_prelim);
        System.out.println("\nThe grade for midterm is: " + Grade_midterm);
        System.out.println("\nThe Total grade is: " + Grade_total);
        System.out.println("\n\nThe Final Grade Average is: " + Grade_average);
    }
}
