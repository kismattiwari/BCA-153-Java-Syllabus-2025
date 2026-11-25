package Unit_1_Introduction_To_Java;
import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student name : ");
        String name = sc.nextLine();

        System.out.print("Enter roll number : ");
        int roll = sc.nextInt();

        System.out.print("Enter your Percentage : ");
        double percentage = sc.nextDouble();

        System.out.print("Pass Status (True/False) : ");
        boolean status = sc.nextBoolean();

        System.out.println("-----Students Details-----");
        System.out.println("Name : " + name);
        System.out.println("Roll Number : "+roll);
        System.out.println("Percentage : "+percentage);
        System.out.println("Status : "+status);
    }
}
