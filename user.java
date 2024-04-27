// Java program to check the authentication of the user

// Importing the modules
import java.util.Scanner;

// User Class
public class user {
    // Main CLass

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        System.out.println("provide input");
        // Declaring the username and password
        String u = read.nextLine();
        String p = read.nextLine();

        // Checking the validity of the input
        if (u.equals("Saloni") && p.equals("Saloni")) {
            // Printing Output
            System.out.println("Authentication Successful");
        } else {
            // Printing Output
            System.out.println("User name/ Password not matching");
        }
    }
}
