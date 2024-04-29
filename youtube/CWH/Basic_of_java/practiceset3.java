package youtube.CWH.Basic_of_java;

import java.util.Scanner;

public class practiceset3 {
    public static void main(String[] args) {
        /*Write a java program which asks the user to enter his/her name and greets them with "hello <name>, have a good day" */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello "+name+", have a good day");
        sc.close();
    }
}
