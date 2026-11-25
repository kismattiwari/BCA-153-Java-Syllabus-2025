public class StringBufferDemo_20 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        // append()
        sb.append(" World");
        System.out.println("After append: " + sb);

        // insert()
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);

        // delete()
        sb.delete(6, 11);
        System.out.println("After delete: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}