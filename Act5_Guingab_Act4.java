// Guingab, Jayco M. - Activity#3

public class Act5_Guingab_Act4 {
    public static void main(String[] args) {
        int TRI_rows = 10;

        System.out.println("1. Right Triangle:\n");
        for (int i = 1; i <= TRI_rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n2. Left Triangle:\n");
        for (int i = 1; i <= TRI_rows; i++) {
            for (int j = 1; j <= TRI_rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n3. Triangle:\n");
        for (int i = 1; i <= TRI_rows; i++) {
            for (int j = 1; j <= TRI_rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n4. Inverted Left Triangle:\n");
        for (int i = TRI_rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n5. Inverted Right Triangle:\n");
        for (int i = TRI_rows; i >= 1; i--) {
            for (int j = 1; j <= TRI_rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n6. Inverted Left Triangle and Right Triangle:\n");
        for (int i = 1; i <= TRI_rows; i++) {
            for (int j = i; j <= TRI_rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 2; i <= TRI_rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
