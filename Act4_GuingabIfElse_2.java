//GuingabIfElse#2

package Act4_GuingabIfElse_2;

import java.util.Scanner;

public class Act4_GuingabIfElse_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int numInput = input.nextInt();

        if ( numInput % 2 == 0) {
            System.out.println(numInput + " is an 'EVEN' number.");
        } else {
            System.out.println(numInput + " is an 'ODD' number.");
        }
    }
}
