package youtube.CWH.Basic_of_java;

import java.util.Scanner;

public class practiceset5 {
    public static void main(String[] args) {
        // Write a java program to detect wheter a number entered by the user is integer
        // or not

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
        sc.close();

    }
}
