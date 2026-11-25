import java.util.Scanner;

class PERSON {
    String pname, paddress;
    long phone;

    void inputPerson() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        pname = sc.nextLine();

        System.out.print("Enter address: ");
        paddress = sc.nextLine();

        System.out.print("Enter phone: ");
        phone = sc.nextLong();
    }

    void displayPerson() {
        System.out.println("Name: " + pname);
        System.out.println("Address: " + paddress);
        System.out.println("Phone: " + phone);
    }
}

class Customer extends PERSON {
    double creditLimit;

    void inputCustomer() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter credit limit: ");
        creditLimit = sc.nextDouble();
    }

    void displayCustomer() {
        displayPerson();
        System.out.println("Credit Limit: " + creditLimit);
    }
}

public class assign_7 {
    public static void main(String[] args) {
        Customer c = new Customer();

        c.inputPerson();
        c.inputCustomer();

        System.out.println("\nCustomer Information:");
        c.displayCustomer();
    }
}