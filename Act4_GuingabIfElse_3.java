//GuingabIfElse#3

package Act4_GuingabIfElse_3;

import java.util.Scanner;

public class Act4_GuingabIfElse_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Customer Name: ");
        input.nextLine();

        System.out.print("Purchased Item: ");
        input.nextLine();

        System.out.print("Quantity: ");
        int quantity = input.nextInt();

        System.out.print("Price: ");
        int price = input.nextInt();
           
        int total = quantity * price;
        System.out.println("Total Price is: " + total);
        
        if (total >= 1000) {
            total = (int) (total * 0.7); // 30% discount
        } else {
            total = total; // No discount
        }

        System.out.print("Cash: ");
        int cash = input.nextInt();

        int change = cash - total;

        System.out.println("The Total Bill is: " + total);
        System.out.println("The Change is: " + change);
    }
}
