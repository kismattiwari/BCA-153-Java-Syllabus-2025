import java.util.Scanner;

class PERSON_1 {
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

class Customer_1 extends PERSON_1 {
    double creditLimit;

    void inputCustomer() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter credit limit: ");
        creditLimit = sc.nextDouble();
    }

    void displayCustomer() {
        System.out.println("Credit Limit: " + creditLimit);
    }
}

class Sales extends Customer_1 {
    int salesQuantity;
    double rate;

    void inputSales() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sales quantity: ");
        salesQuantity = sc.nextInt();

        System.out.print("Enter rate: ");
        rate = sc.nextDouble();
    }

    void displaySales() {
        System.out.println("Sales Quantity: " + salesQuantity);
        System.out.println("Rate: " + rate);
    }
}

public class assign_8 {
    public static void main(String[] args) {
        Sales s = new Sales();

        s.inputPerson();
        s.inputCustomer();
        s.inputSales();

        System.out.println("\nAll Information:");
        s.displayPerson();
        s.displayCustomer();
        s.displaySales();
    }
}