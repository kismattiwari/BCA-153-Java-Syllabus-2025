import java.io.FileReader;
import java.io.FileWriter;

public class assign_25 {
    public static void main(String[] args) {
        try {
            // Read from source.txt
            FileReader fr = new FileReader("source.txt");

            // Write into dest.txt
            FileWriter fw = new FileWriter("dest.txt");

            int ch;

            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("File copied successfully.");
        }
        catch (Exception e) {
            System.out.println("Error occurred.");
        }
    }
}