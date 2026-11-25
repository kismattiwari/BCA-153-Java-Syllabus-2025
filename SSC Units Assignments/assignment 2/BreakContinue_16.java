public class BreakContinue_16 {
    public static void main(String[] args) {

        System.out.println("Using continue:");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("\nUsing break:");

        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.println(i);
        }
    }
}