package Act4_GuingabIf;

import java.util.Scanner;

public class Act4_GuingabIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a grade: ");
        String STUD_GRADE = input.nextLine();

        String equivalent = "";

        if (STUD_GRADE.equalsIgnoreCase("A")) {
            equivalent = "EXCELLENT";
        }

        if (STUD_GRADE.equalsIgnoreCase("B")) {
            equivalent = "VERY GOOD";
        }

        if (STUD_GRADE.equalsIgnoreCase("C")) {
            equivalent = "GOOD";
        }

        if (STUD_GRADE.equalsIgnoreCase("D")) {
            equivalent = "FAIR";
        }

        if (STUD_GRADE.equalsIgnoreCase("E")) {
            equivalent = "POOR";
        }

        if (STUD_GRADE.equalsIgnoreCase("F")) {
            equivalent = "NEEDS IMPROVEMENT";
        }

        if (equivalent.equals("")) {
            equivalent = "INVALID GRADE";
        }

        System.out.println(STUD_GRADE + " IS YOUR GRADE AND YOU ARE " + equivalent);
    }
}
