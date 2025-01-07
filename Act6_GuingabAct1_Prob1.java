import java.util.Scanner;

public class Act6_GuingabAct1_Prob1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int numNames = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] names = new String[numNames];

        for (int i = 0; i < numNames; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        System.out.println("Example Output:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ". " + names[i]);
        }

        scanner.close();
    }
}
