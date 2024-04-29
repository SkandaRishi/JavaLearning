package youtube.CWH.Basic_of_java;

import java.util.Scanner;

public class practiceset2 {
    public static void main(String[] args) {
        // Write a program to calculate CGPA using marks of three subject
        
        System.out.println("Enter the marks of three subject");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of Math: ");
        int math = sc.nextInt();

        System.out.println("Enter marks of Science: ");
        int Science = sc.nextInt();

        System.out.println("Enter marks of Hindi: ");
        int hindi = sc.nextInt();

        float cgpa = (math+Science+hindi)/30f;
        System.out.println("your cgpa is: "+cgpa);

        sc.close();
    }
}
