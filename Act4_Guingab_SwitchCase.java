//GuingabSwitchCase

package Act4_Guingab_SwitchCase;

import java.util.Scanner;

public class Act4_Guingab_SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius_Circle, length, width, area;
        char choice;

        do {
            System.out.println("[C]   Circle   [R]   Rectangle   [S]   Square   [E]   Exit");
            System.out.print("Please Enter Your Choice: ");
            choice = input.next().charAt(0);
            System.out.println();

            switch (choice) {
                case 'C':
                case 'c':
                    System.out.print("RADIUS OF THE CIRCLE: ");
                    radius_Circle = input.nextDouble();
                    area = Math.PI * radius_Circle * radius_Circle;
                    System.out.println("AREA OF CIRCLE: " + area);
                    break;

                case 'S':
                case 's':
                    System.out.print("LENGTH OF SQUARE: ");
                    length = input.nextDouble();
                    area = length * length;
                    System.out.println("AREA OF SQUARE: " + area);
                    break;

                case 'R':
                case 'r':
                    System.out.print("LENGTH OF RECTANGLE: ");
                    length = input.nextDouble();
                    System.out.print("WIDTH OF RECTANGLE: ");
                    width = input.nextDouble();
                    area = length * width;
                    System.out.println("AREA OF RECTANGLE: " + area);
                    break;

                case 'E':
                case 'e':
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please choose again.");
                    break;
            }
            System.out.println();
        } while (choice != 'E' && choice != 'e');

        input.close();
    }
}
