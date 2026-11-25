import java.util.HashSet;
import java.util.TreeSet;

public class assign_28 {
    public static void main(String[] args) {

        HashSet<Integer> hset = new HashSet<>();
        hset.add(30);
        hset.add(10);
        hset.add(20);
        hset.add(10);

        TreeSet<Integer> tset = new TreeSet<>();
        tset.add(30);
        tset.add(10);
        tset.add(20);
        tset.add(10);

        System.out.println("HashSet: " + hset);
        System.out.println("TreeSet: " + tset);
    }
}