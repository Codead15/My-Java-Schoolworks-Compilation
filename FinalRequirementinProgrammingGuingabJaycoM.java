package finalrequirementprogrammingGuingabJaycoM;
import java.util.Scanner;
public class FinalRequirementinProgrammingGuingabJaycoM {

	public static void main(String[] args) {
		Scanner inputKo = new Scanner(System.in);

        // Variable Declaration

        String Accomodation[] = {"", "Pang-opisina Room", "Pang-pamilya Room", "Pang-isports Room"};
        double ServiceRate[] = {0, 6, 4, 2};
        double RoomRate[] = {0.00, 900.00, 750.00, 650.00, 825.00};

        double AccomodationFee = 0;
        double ServiceFee = 0;
        double GrossFee = 0;


        // Input

        System.out.print("Guest Name: ");
        String GuestName = inputKo.nextLine();

        if (GuestName.length() < 2 || GuestName.length() > 20) {
            System.out.println("\nMust input 2 to 20 characters.");
            System.exit(1);
        }

        System.out.print("Accomodation Code: ");
        int AccomodationCodeInput = inputKo.nextInt();

        if (AccomodationCodeInput < 1 || AccomodationCodeInput > 3) {
            System.out.println("\nMust input 1 to 3 only.");
            System.exit(1);
        }

        System.out.print("Room Number: ");
        int RoomNumber = inputKo.nextInt();

        if (RoomNumber < 1 || RoomNumber > 4) {
            System.out.println("\nMust input 1 to 4 only");
            System.exit(1);
        }

        System.out.print("Days Stay: ");
        int DaysStayInput = inputKo.nextInt();

        if (DaysStayInput < 2 || DaysStayInput > 30) {
            System.out.println("\nMust input 2 to 30 characters: ");
            System.exit(1);
        }


        // Operation

        AccomodationFee = RoomRate[RoomNumber] * DaysStayInput;
        ServiceFee = AccomodationFee * ServiceRate[AccomodationCodeInput] / 100;
        GrossFee = AccomodationFee + ServiceFee;


        // Output

        System.out.println("\n\n\nGuest Name: " + GuestName);
        System.out.println("Room Number: " + RoomNumber);
        System.out.println("Accomodation Code: " + Accomodation[AccomodationCodeInput]);
        System.out.println("Service Rate: " + ServiceRate[AccomodationCodeInput]);

        System.out.println("\nRoom Rate: " + RoomRate[RoomNumber]);
        System.out.println("Days Stay: " + DaysStayInput);
        System.out.println("Accomodation Fee: " + AccomodationFee);
        System.out.println("Add Service Fee: " + ServiceFee);

        System.out.println("\nGross Fee: " + GrossFee);
    



	}

}
