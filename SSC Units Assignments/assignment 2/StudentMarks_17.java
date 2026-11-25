import java.util.Scanner;

public class StudentMarks_17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        // Input marks
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Display marks
        System.out.println("\nMarks of five students:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Student " + (i + 1) + " = " + marks[i]);
        }

        sc.close();
    }
}