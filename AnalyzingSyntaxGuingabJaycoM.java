package analyzingsyntaxGuingabJaycoM;
import java.util.Scanner;
public class AnalyzingSyntaxGuingabJaycoM {
	



		public static void main(String[] args) {

			

			//Declare variables

			

			String sname, cdesc = "", ses ="";

			

			int scode;

			int ccode, pdisc = 0;

			double cfee = 0, rfee, dmat, tbal;

			

			// input

			

			System.out.printf("\n");

			

				Scanner in = new Scanner(System.in);

			

			System.out.printf("Student Name :  ");

			sname = in.nextLine ();

			

			System.out.printf("Session Code (1/2): ");

			scode = in.nextInt ();

			

			

			if (scode==1) ses="Morning";

			if (scode==2) ses="Afternoon";

			

			System.out.printf("Course Code (50-52): ");

			ccode = in.nextInt ();

			

			if (ccode==50) {cdesc="C++"; cfee = 7000.00; }

			if (ccode==51) {cdesc="Java"; cfee = 8000.00; }

			if (ccode==52) {cdesc="Visual Basic"; cfee = 9000.00; }

			

			System.out.printf("Registration Fee: ");	

			rfee = in.nextFloat();

			

			if (rfee <=4499.99) pdisc = 0;

			if (rfee >=4500.00 &&rfee <= 5499.99) pdisc = 2;

			if (rfee >=5500.00 &&rfee <= 6499.99) pdisc = 4;

			if (rfee >= 6500.00) pdisc = 6;

			

			//compute

			

			dmat = cfee*pdisc/100;

			tbal= cfee-(rfee+dmat);

			

			//display

			

			

			System.out.println("\n\n\n");

			System.out.printf("Student Name:  %s\n",sname);

			System.out.printf("Session:  %s\n", ses);

			System.out.printf("Course Desc: %s\n ", cdesc);

			System.out.printf("Total Balance: P %7.2f\n\n", tbal);

		}




	}
