import java.io.FileWriter;
import java.io.FileReader;

public class assign_21 {
    public static void main(String[] args) {
        try {
            // Writing contents
            FileWriter fw = new FileWriter("demo.txt");
            fw.write("Hello Welcome to Nepal");
            fw.close();

            // Reading contents
            FileReader fr = new FileReader("demo.txt");

            int ch;
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