package youtube.CWH.Basic_of_java;
import java.util.Scanner;
public class practiceset1 {
    public static void main(String []args){
        // Write a program to sum three numbers in java
        System.out.println("Enter three numbers: ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int sum = a+b+c;
        System.out.println("Sum of "+a+"+ " + b +"+ "+c+" is: "+sum);

        sc.close();

    }
    
}
