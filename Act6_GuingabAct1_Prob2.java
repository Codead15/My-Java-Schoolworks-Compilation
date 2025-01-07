//Guingab, Jayco M. - Activity#1_Problem2

import java.util.Scanner;

public class Act6_GuingabAct1_Prob2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] names = new String[numStudents];
        double[] prelimGrades = new double[numStudents];
        double[] midtermGrades = new double[numStudents];
        double[] finalsGrades = new double[numStudents];
        double[] averages = new double[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("\nEnter the name of student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();

            System.out.print("Enter Prelim Grade: ");
            prelimGrades[i] = scanner.nextDouble();

            System.out.print("Enter Midterm Grade: ");
            midtermGrades[i] = scanner.nextDouble();

            System.out.print("Enter Finals Grade: ");
            finalsGrades[i] = scanner.nextDouble();

            averages[i] = (prelimGrades[i] + midtermGrades[i] + finalsGrades[i]) / 3.0;

            System.out.println("Average: " + averages[i]);

            scanner.nextLine(); // Consume the newline character
        }

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nName        : " + names[i]);
            System.out.println("Prelim      : " + prelimGrades[i]);
            System.out.println("Midterm     : " + midtermGrades[i]);
            System.out.println("Finals      : " + finalsGrades[i]);
        }

        scanner.close();
    }
}
