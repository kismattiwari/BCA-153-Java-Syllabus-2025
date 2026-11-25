import java.util.Scanner;

public class PrimeComposite_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (num <= 1) {
            System.out.println("The number is neither prime nor composite.");
        } else if (count == 2) {
            System.out.println("The number is Prime.");
        } else {
            System.out.println("The number is Composite.");
        }

        sc.close();
    }
}