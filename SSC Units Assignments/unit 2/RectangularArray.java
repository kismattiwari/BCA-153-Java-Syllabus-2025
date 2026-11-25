public class RectangularArray
{
    public static void main(String[] args)
    {
        int[][] classroom = {{101,102,103},{201,202,203}};
        System.out.println("Printing Recttangular Array(2x3)");
        for(int row = 0; row<classroom.length; row++)
        {
            for(int col = 0; col<classroom[row].length; col++)
            {
                System.out.print(classroom[row][col] + " ");
            }
            System.out.println(); //new line after each row
        }
    }
}