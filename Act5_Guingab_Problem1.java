//Guingab, Jayco M. - Problem#1

import java.io.*;

public class Act5_Guingab_Problem1 {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String name;

        System.out.print("Enter your name: ");
        name = input.readLine();

        int i = 0;
        while (i < 10) {
            System.out.println("Name Provided: " + name);
            i++;
        }
    }
}
