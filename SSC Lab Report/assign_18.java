import java.io.FileWriter;
import java.util.Scanner;

public class assign_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        try {
            FileWriter fw = new FileWriter("demo.txt");
            fw.write(str);
            fw.close();

            System.out.println("Data stored successfully.");
        }
        catch (Exception e) {
            System.out.println("Error occurred.");
        }
    }
}