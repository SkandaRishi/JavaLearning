package youtube.CWH.Basic_of_java;
import java.util.Scanner;

public class takinginput {
    public static void main(String[] args) {
        // Prompting the user for input
        System.out.println("Welcome! This program calculates the sum of two numbers.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        // always close sc in vs code
        sc.close();
    }
}
