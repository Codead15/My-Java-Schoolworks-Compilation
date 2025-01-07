// Guingab, Jayco M. - Activity#2
import java.util.Scanner;

public class Act5_Guingab_Act2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String customerName;
        String purchasedItem;
        int quantity;
        double price;
        int cash;
        char tryAgain = 'Y';

        while (tryAgain == 'Y') {
            System.out.print("Please enter Customer Name: ");
            customerName = input.nextLine();

            System.out.print("Please enter Purchased Item: ");
            purchasedItem = input.nextLine();

            System.out.print("Please enter Quantity: ");
            quantity = input.nextInt();

            System.out.print("Please enter Price: ");
            price = input.nextDouble();

            System.out.print("Please enter Cash: ");
            cash = input.nextInt();

            double totalBill = quantity * price;

            // Applying discount if total bill reaches 1000 pesos
            if (totalBill >= 1000) {
                double discount = 0.03 * totalBill;
                totalBill -= discount;
                System.out.println("Discount Applied: " + discount);
            }

            double change = cash - totalBill;

            System.out.println("\nCustomer Name: " + customerName);
            System.out.println("Purchased Item: " + purchasedItem);
            System.out.println("Quantity: " + quantity);
            System.out.println("Price: " + price);
            System.out.println("Total Bill: " + totalBill);
            System.out.println("Cash: " + cash);
            System.out.println("Change: " + change);

            System.out.print("\nDo you want to try again? Y/N: ");
            tryAgain = input.next().charAt(0);
            input.nextLine(); // Consume the newline character

            System.out.println();

            if (tryAgain == 'N') {
                System.out.println("Thank you for your purchase!");
            } else {
                if (tryAgain != 'Y') {
                    System.out.println("Invalid input. Exiting the program.");
                    break; // Exit the loop if input is neither 'Y' nor 'N'
                }
            }
        }
    }
}
