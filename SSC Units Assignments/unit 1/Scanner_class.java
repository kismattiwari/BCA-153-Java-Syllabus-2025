import java.util.Scanner;
public class Scanner_class {
    public static void main (String[] args) {
        String name;
        int age;
        Scanner sc =new Scanner (System.in);
        System.out.println("enter your name");
        name = sc.nextLine();
        System.out.println("enter you age");
        age = sc.nextInt();
        System.out.println("your name is "+name);
        System.out.println("your age is "+age);
        sc.close();
    }
}
