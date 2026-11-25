import java.io.FileReader;

public class assign_19 {
    public static void main(String[] args) {
        try {
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