import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the radius of the circle
        System.out.println("Enter Radius: ");
        
        // Read the input radius entered by the user and convert it to an integer
        int radius = Integer.parseInt(sc.nextLine());
        
        // Calculate the area of the circle using the input radius
        float area = 3.14f * radius * radius; 
        
        // Print the calculated area of the circle
        System.out.println("Area of circle is " + area);
        sc.close();
    }
}
