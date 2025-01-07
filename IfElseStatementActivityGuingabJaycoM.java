package IfElseStatementActivityGuingabJaycoM;
public class IfElseStatementActivityGuingabJaycoM {
    public static void main(String[] args) {

        double CourseFee = 0;
        String CourseDesc = "";
        int PctDisc = 0;
        double DiscAmount = 0;
        double TotalBalance = 0;
        String Time = "";

        System.out.println("Input");

        System.out.print("Student Name: ");
        String StudentName = System.console().readLine();

        System.out.print("\nSession Code: ");
        int SessionCode = Integer.parseInt(System.console().readLine());


        if (SessionCode < 1 || SessionCode > 2) {
            System.out.println("Only number 1 and number 2 are allowed.");
            System.exit(1);
        }

        if (SessionCode == 1) {
            Time = "Morning";
        } else if (SessionCode == 2) {
            Time = "Afternoon";
        }

        System.out.print("\nCourse Code: ");
        int CourseCode = Integer.parseInt(System.console().readLine());

        if (CourseCode < 50 || CourseCode > 52) {
            System.out.println("Only numbers 50-52 are allowed.");
            System.exit(1);
        }
        if (CourseCode == 50) {
            CourseDesc = "C++";
            CourseFee = 7000.00;
        } else if (CourseCode == 51) {
            CourseDesc = "Java";
            CourseFee = 8000.00;
        } else if (CourseCode == 52) {
            CourseDesc = "Visual Basic";
            CourseFee = 9000.00;
        }


        System.out.print("\nRegistration Fee: ");
        double RegistrationFee = Double.parseDouble(System.console().readLine());

        if (RegistrationFee < 3500.00) {
            System.out.print("\nYour money is insufficient.");
            System.exit(1);
        }

        else if (RegistrationFee < 4499.99)
            PctDisc = 0;
        else if (RegistrationFee >= 4500.00 && RegistrationFee <= 5499.99)
            PctDisc = 2;
        else if (RegistrationFee >= 5500.00 && RegistrationFee <= 6499.99)
            PctDisc = 4;
        else if (RegistrationFee >= 6500.00)
            PctDisc = 6;

        DiscAmount = CourseFee * PctDisc / 100;

        TotalBalance = CourseFee - (RegistrationFee + DiscAmount);

        //output
        System.out.println("\nOutput");
        System.out.println("Student Name: " + StudentName);
        System.out.println("\nSession Code: " + Time);
        System.out.println("\nCourse Desc: " + CourseDesc);
        System.out.println("\nTotal Balance: " + TotalBalance);
    }
}