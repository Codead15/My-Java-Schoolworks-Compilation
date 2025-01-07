package activity2forIfStatementGuingabJaycoMoral;
import java.util.Scanner;
public class Activity2forIFStatementGuingabJaycoMoral {

	public static void main(String[] args) {
		
		        Scanner Jayco = new Scanner(System.in);

		        // Declare Variables
		        
		        String IType = "";
		        double UPrice = 0d;

		        String PType = "";
		        int PCharge = 0;


		        // Input
		        
		        System.out.print("Purchase Name: ");
		        String PName = Jayco.nextLine();
		        
		        if (PName.length() < 2 || PName.length() > 25) {
		            System.out.print("\nBetween 2-25 characters are only allowed.");
		            System.exit(1);
		        }
		        
		        System.out.print("Item Code (15-65): ");
		        int ICode = Jayco.nextInt();

		        if (ICode < 15 || ICode > 65) {
		            System.out.print("\nBetween 15-65 numbers are only allowed.");
		            System.exit(1);
		        }

		        if (ICode < 36) {
		            IType = "Hakata Printer";
		            UPrice = 6560.50d;
		        } else if (ICode == 36 || ICode <= 50) {
		            IType = "Atami System Unit";
		            UPrice = 9365.50d;
		        } else if (ICode == 51 || ICode <= 58) {
		            IType = "Hakata Monitor";
		            UPrice = 5500.43d;
		        } else if (ICode >= 59) {
		            IType = "Hakone Keyboard";
		            UPrice = 3678.99d;
		        }
		        
		        System.out.print("Qty Purchased (2-50): ");
		        int QtyP = Jayco.nextInt();

		        if (QtyP < 2 || QtyP > 50) {
		            System.out.print("\nBetween 2-50 numbers are only allowed.");
		            System.exit(1);
		        }
		        
		        System.out.print("Payment Code (1-2): ");
		        int PCode = Jayco.nextInt();

		        if (PCode != 1 && PCode != 2) {
		            System.out.print("\nBetween 1-2 numbers are only allowed.");
		            System.exit(1);
		        }

		        if (PCode == 1) {
		            PType = "Cash";
		            PCharge = 0;
		        } else if (PCode == 2) {
		            PType = "Check";
		            PCharge = 10;
		        }
		        
		        double GBill = QtyP * UPrice;
		        double ACharge = GBill * PCharge / 100;
		        double NBill = GBill + ACharge;

		        // Output
		        
		        System.out.println("\n");
		        System.out.println("Purchase Name: " + PName);
		        System.out.println("\nItem Code: " + ICode);
		        System.out.println("Item Type: " + IType);
		        System.out.println("Unit Price: " + UPrice);
		        System.out.println("\nQty Purchased: " + QtyP);
		        System.out.println("\nPayment Code: " + PCode);
		        System.out.println("Payment Type: " + PType);
		        System.out.println("Pct Charge: " + PCharge);
		        System.out.println("\nGross Bill: " + GBill);
		        System.out.println("Added Charge: " + ACharge);
		        System.out.println("Net Bill: " + NBill);
		    }

	} 