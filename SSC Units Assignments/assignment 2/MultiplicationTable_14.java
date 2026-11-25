import java.util.Scanner;

public class MultiplicationTable_14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

            for (int j = 1; j <= 10; j++) 
            {
                System.out.println(num + " x " + j + " = " + (num * j));
            }
    

        sc.close();
    }
}