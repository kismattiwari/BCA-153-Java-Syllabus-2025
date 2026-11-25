import java.util.ArrayList;

public class assign_27 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // Remove an element
        list.remove("Banana");

        // Traverse the ArrayList
        System.out.println("ArrayList elements:");

        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}