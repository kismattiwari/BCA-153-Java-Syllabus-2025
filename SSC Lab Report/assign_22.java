import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

public class assign_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Read data from keyboard
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            // Write data into file
            FileWriter fw = new FileWriter("demo.txt");
            fw.write(str);
            fw.close();

            // Read data from same file
            FileReader fr = new FileReader("demo.txt");

            int ch;
            System.out.println("Data from file:");

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();
        }
        catch (Exception e) {
            System.out.println("Error occurred.");
        }
    }
}