public class assign_12 {
    public static void main(String[] args) {

        // Array Index Out of Bounds Exception
        try {
            int a[] = {10, 20, 30};
            System.out.println(a[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        }

        // Null Pointer Exception
        try {
            String name = null;
            System.out.println(name.length());
        }
        catch (NullPointerException e) {
            System.out.println("Null pointer exception occurred.");
        }
    }
}