//GuingabIfElse#1

import java.util.Scanner;

public class Act4_GuingabIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String vrfctn_password = scanner.nextLine();

        if (vrfctn_password.equals("jayco".toUpperCase())) {
            System.out.println("Your password is granted:" + vrfctn_password);
        } else {
            System.out.println("Your password is denied:" + vrfctn_password);
        }
    }
}