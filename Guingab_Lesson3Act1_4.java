//Guingab, Jayco M. - Lesson3.Act1_4

public class Guingab_Lesson3Act1_4 {

    public static void main(String[] args) {
         // Declare and initialize variables
           String customerName = "Maria";
           double interest, principalAmount, rateOfInterest, time, withholdingTax, netInterest;
           principalAmount = 30000;
           rateOfInterest = .12;
           time = (30.0 / 360.0);
   
        // Calculate interest and withholding tax
        interest = principalAmount * rateOfInterest * time;
        withholdingTax = interest * .10;
        netInterest = interest - withholdingTax;

        // Display results
          System.out.println("Customer Name: " + customerName);
          System.out.printf("Withholding Tax: Php %.2f\n", withholdingTax);
          System.out.printf("Net Interest: Php %.2f\n", netInterest);
    }
}

 