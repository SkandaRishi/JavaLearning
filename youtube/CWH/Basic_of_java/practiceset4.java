package youtube.CWH.Basic_of_java;

import java.util.Scanner;

public class practiceset4 {
    public static void main(String[] args) {
        //write a java program to convert kilometers to miles
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Distance in kilometers: ");
        float distance = sc.nextFloat();

        float newdis = distance*0.621371f;
        System.out.println("Your distance in miles is: "+newdis+ " miles");
        sc.close();

    }
}
