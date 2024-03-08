import java.util.Scanner;

public class a2input {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a line of text
        System.out.println("Enter your name: ");
        
        // Read a line of text entered by the user and store it in the 'name' variable
        String name = sc.nextLine();
        
        // Print the value of 'name' to the console
        System.out.println("Hello, " + name + "!");
        
        // Close the Scanner object to release system resources
        sc.close();
    }
}
