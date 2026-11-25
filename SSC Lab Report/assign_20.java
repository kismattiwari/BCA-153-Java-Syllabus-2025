import java.io.FileOutputStream;
import java.io.FileInputStream;

public class assign_20 {
    public static void main(String[] args) {
        try {
            // Byte writing
            FileOutputStream fos = new FileOutputStream("demo.txt");

            String str = "Hello Nepal";
            byte[] data = str.getBytes();

            fos.write(data);
            fos.close();

            // Byte reading
            FileInputStream fis = new FileInputStream("demo.txt");

            int b;
            while ((b = fis.read()) != -1) {
                System.out.print((char) b);
            }

            fis.close();
        }
        catch (Exception e) {
            System.out.println("Error occurred.");
        }
    }
}