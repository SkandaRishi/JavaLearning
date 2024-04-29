package youtube.CWH.Basic_of_java;
import java.util.Scanner;


public class quiz2 {
    public static void main(String[] args) {
        /*write a program to calculate percentage of a given student in cbse board exam. his makrs from 5 subjects must be taken as input
         from the keyboard. mark out of 100         */
         System.out.println("Enter marks of your subject: ");
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter makrs of Science: ");
         int Science = sc.nextInt();

         System.out.print("Enter marks of Math: ");
         int Math = sc.nextInt();

         System.out.print("Enter marks of Social Studies: ");
         int SSt = sc.nextInt();

         System.out.print("Enter marks of Hindi: ");
         int Hindi = sc.nextInt();

         System.out.print("Enter marks of English: ");
         int English = sc.nextInt();

         int sum = Science+Math+SSt+Hindi+English;
         double percentage = sum/5.00;
         System.out.println("The percentage of your marks is: "+ percentage + "%");
         sc.close();
    }
}
