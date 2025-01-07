package activityforarrayGuingabJaycoM;

import java.util.*;

public class ActivityforArrayGuigabJaycoMoral {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare variables
		
		String tname;
		int hcode, gcode, tdays;
		double tfee;
		
		//data in arrays
		
		String hname [] = { "", "InSugar Hotel","Butong Hotel","Apo New Hotel"};
		
		String gname [] = { "", "Jane Bond", "Sylvie Rambo", "Diega Silang", "Sabel Lopez"};
		
		double rday [] = {0,1106.00, 930.90, 920.30, 1107.00};
		
		// input
		
		System.out.printf("\n");
		
		Scanner in = new Scanner(System.in);
		
		System.out.printf("Tourist Name :");
		tname = in.nextLine();
		
		
		System.out.printf("Hotel Code (1-3):");
		hcode = in.nextInt();
		
		
		System.out.printf("Guide Code (1-4):");
		gcode = in.nextInt();
		
		System.out.printf("Tour Days (3-9):");
		tdays = in.nextInt();
		
		// compute
		
		tfee =rday[gcode]*tdays;
		
		// display
		
		System.out.printf("\n\n\n");
		System.out.printf("Tourist Name: %s\n", tname);
		System.out.printf("Hotel: %s\n", hname [hcode]);
		System.out.printf("Guide Name: %s\n\n", gname [gcode]);
		System.out.printf("Tour Days: %d days \n", tdays);
		System.out.printf("Rate Per Day: %7.2f\n\n", rday [gcode]);
		System.out.printf("Total Fee: %7.2f\n", tfee);
	}

}



