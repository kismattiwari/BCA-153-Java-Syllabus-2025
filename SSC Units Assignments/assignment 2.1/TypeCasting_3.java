public class TypeCasting_3 {
    public static void main(String[] args) {

        // Implicit type casting
        int a = 10;
        double b = a;

        System.out.println("Implicit Type Casting:");
        System.out.println("Integer value = " + a);
        System.out.println("Double value = " + b);

        // Explicit type casting
        double x = 25.75;
        int y = (int) x;

        System.out.println("\nExplicit Type Casting:");
        System.out.println("Double value = " + x);
        System.out.println("Integer value = " + y);
    }
}