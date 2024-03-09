import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        
        // Read the input number provided by the user
        int number = scanner.nextInt();
        
        // Print the table of the input number from 1 to 10
        System.out.println("Table of " + number + ":");
        System.out.println(number + " x 1 = " + (number * 1));
        System.out.println(number + " x 2 = " + (number * 2));
        System.out.println(number + " x 3 = " + (number * 3));
        System.out.println(number + " x 4 = " + (number * 4));
        System.out.println(number + " x 5 = " + (number * 5));
        System.out.println(number + " x 6 = " + (number * 6));
        System.out.println(number + " x 7 = " + (number * 7));
        System.out.println(number + " x 8 = " + (number * 8));
        System.out.println(number + " x 9 = " + (number * 9));
        System.out.println(number + " x 10 = " + (number * 10));
        
        // Close the Scanner object to release system resources
        scanner.close();
    }
}

    
