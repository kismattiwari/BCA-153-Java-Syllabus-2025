import java.util.Scanner;

abstract class PERSON_2 {
    String name, address;

    abstract void aget();
    abstract void adisplay();
}

class Customer_2 extends PERSON_2{
    double creditLimit;

    void aget() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        name = sc.nextLine();

        System.out.print("Enter customer address: ");
        address = sc.nextLine();

        System.out.print("Enter credit limit: ");
        creditLimit = sc.nextDouble();
    }

    void adisplay() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Address: " + address);
        System.out.println("Credit Limit: " + creditLimit);
    }
}

class Student_2 extends PERSON_2 {
    int roll;

    void aget() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        name = sc.nextLine();

        System.out.print("Enter student address: ");
        address = sc.nextLine();

        System.out.print("Enter roll number: ");
        roll = sc.nextInt();
    }

    void adisplay() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Address: " + address);
        System.out.println("Roll Number: " + roll);
    }
}

public class assign_10 {
    public static void main(String[] args) {
        Customer_2 c = new Customer_2();
        Student_2 s = new Student_2();

        System.out.println("Enter Customer Information:");
        c.aget();

        System.out.println("\nEnter Student Information:");
        s.aget();

        System.out.println("\nCustomer Information:");
        c.adisplay();

        System.out.println("\nStudent Information:");
        s.adisplay();
    }
}