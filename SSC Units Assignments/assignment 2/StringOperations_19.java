public class StringOperations_19
 {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";

        // Concatenation
        String result = str1 + " " + str2;
        System.out.println("Concatenation: " + result);

        // Comparison
        System.out.println("Comparison: " + str1.equals(str2));

        // Case conversion
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str2.toLowerCase());

        // Searching
        System.out.println("Position of 'l' in Hello: " + str1.indexOf('l'));
        System.out.println("Contains 'World': " + result.contains("World"));
    }
}