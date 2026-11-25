import java.util.HashMap;

public class assign_29 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        // Insert elements
        map.put(1, "Ram");
        map.put(2, "Sita");
        map.put(3, "Hari");

        // Retrieve element
        System.out.println("Name: " + map.get(2));

        // Delete element
        map.remove(3);

        // Display HashMap
        System.out.println("HashMap: " + map);
    }
}