package partII;

public class PartII {

	public static void main(String[] args) {
		String EmployeeName = "Guingab, Jayco M.";
		String EmployeeNo = "14344";
		char EmployeeStatus = 'R';
		String Department= "Accounting";
		
		int DaysWorked = 22;
		double DailyRate = 300.18d;
		double Grosspay = DaysWorked * DailyRate;
		
		double LessTax = 270.00d;
		double SSS = 120.00d;
		double CA = 450.00d;
		
		double NetPay = Grosspay - (LessTax + SSS + CA);
		
		System.out.println("Employee Name: "  +  EmployeeName);
		System.out.println("Employee Number: "  +  EmployeeNo);
		System.out.println("Employee Status: "  +  EmployeeStatus);
		System.out.println("Department: "  +  Department);
		System.out.println();//Naglagay ako para may space kasi yun yung nakalagay dun po sa display format
		System.out.println("Days Worked: " + DaysWorked + " days ");
		System.out.println("Daily Rate: " + DailyRate);
		System.out.println("Gross Pay: "  +  Grosspay);
		System.out.println();
		System.out.println("Less Tax: " + LessTax + "0"); //naglagay ako ng + 0 kasi pagpinrint single 0 lang lumalabas
		System.out.println("SSS: " + SSS + "0");
		System.out.println("CA: " + CA + "0");
		System.out.println();
		System.out.println("Net Pay: "  +  NetPay);
		
		//tapos ko na po finally :D
		
		
		
		
		
		
		
		
		
	
		
		
		
				
		

	}

}
