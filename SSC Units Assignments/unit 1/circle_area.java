import java.util.Scanner;
public class circle_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Radius of Circle");
        double radius = sc.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle is: " + area);
        sc.close();
    }
}
