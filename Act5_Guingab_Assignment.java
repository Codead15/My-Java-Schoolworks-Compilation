 //Guingab, Jayco M. - Assignment

import java.io.*;

public class Act5_Guingab_Assignment {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String name;

        System.out.print("Enter your name: ");
        name = input.readLine();

        // Print the name 10 times
        for (int i = 0; i < 10; i++) {
            System.out.println("Name Provided: " + name);
        }
    }
}

