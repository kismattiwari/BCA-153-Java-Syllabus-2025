import java.io.RandomAccessFile;

public class assign_24 {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("demo.txt", "rw");

            // Writing data
            file.writeUTF("Hello World");

            // Move to the beginning of the file
            file.seek(0);

            // Reading data
            String str = file.readUTF();

            System.out.println("Data: " + str);

            file.close();
        }
        catch (Exception e) {
            System.out.println("Error occurred.");
        }
    }
}