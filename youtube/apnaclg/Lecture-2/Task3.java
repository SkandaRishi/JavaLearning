import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.println("Enter two integers: ");

        // Read the input integers provided by the user
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Calculate the sum of the two integers
        int sum = a + b;

        // Print the sum of the two integers
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);

        // Close the Scanner object to release system resources
        sc.close();
    }
}