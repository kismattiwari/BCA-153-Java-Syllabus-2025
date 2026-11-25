import java.util.ArrayList;
import java.util.Iterator;

public class assign_30 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            String fruit = itr.next();

            System.out.println(fruit);

            if (fruit.equals("Banana")) {
                itr.remove();
            }
        }

        System.out.println("After removal: " + list);
    }
}