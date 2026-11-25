public class jaggedarray {
    public static void main(String[] args) {
        int [] [] jagged = new int[3][];

        jagged[0] = new int[3];
        jagged[1] = new int[1];
        jagged[2] = new int[5];

        jagged[0][0] = 50;
        jagged[1][0] = 100;
        jagged[2][4] = 500;

        System.out.println("printing jagged array structure");
        for (int i = 0; i < jagged.length; i++) {
            System.out.print("Row " + i + "(length: " + jagged[i].length + ") ");
            for (int j = 0; j < jagged[i].length; j++)
                 {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}