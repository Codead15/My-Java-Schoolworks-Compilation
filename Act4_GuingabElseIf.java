//GuingabElseIf

package Act4_GuingabElseIf;

import java.util.Scanner;

public class Act4_GuingabElseIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a grade: ");
        int EQVLNT_grade = input.nextInt();

        if (EQVLNT_grade >= 99 && EQVLNT_grade <= 100) {
            System.out.println("Your grade is 1.00");
        } else if (EQVLNT_grade >= 96 && EQVLNT_grade <= 98) {
            System.out.println("Your grade is 1.25");
        } else if (EQVLNT_grade >= 93 && EQVLNT_grade <= 95) {
            System.out.println("Your grade is 1.50");
        } else if (EQVLNT_grade >= 90 && EQVLNT_grade <= 92) {
            System.out.println("Your grade is 1.75");
        } else if (EQVLNT_grade >= 87 && EQVLNT_grade <= 89) {
            System.out.println("Your grade is 2.00");
        } else if (EQVLNT_grade >= 84 && EQVLNT_grade <= 86) {
            System.out.println("Your grade is 2.25");
        } else if (EQVLNT_grade >= 81 && EQVLNT_grade <= 83) {
            System.out.println("Your grade is 2.50");
        } else if (EQVLNT_grade >= 77 && EQVLNT_grade <= 80) {
            System.out.println("Your grade is 2.75");
        } else if (EQVLNT_grade >= 75 && EQVLNT_grade <= 76) {
            System.out.println("Your grade is 3.00");
        } else {
            System.out.println("Your grade is 5.00");
        }
    }
}
