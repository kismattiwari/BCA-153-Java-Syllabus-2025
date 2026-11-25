import java.io.FileWriter;
import java.io.FileReader;

public class assign_23 {
    public static void main(String[] args) {
        try {
            // Sequential file writing
            FileWriter fw = new FileWriter("demo.txt");

            fw.write("Nepal\n");
            fw.write("India\n");
            fw.write("China\n");

            fw.close();

            // Sequential file reading
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