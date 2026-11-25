class Circle {
    double pi, area;

    Circle() {
        pi = 3.14;
    }

    void cir_area(double rad) {
        area = pi * rad * rad;
        System.out.println("Area of circle is " + area);
    }
}

public class JMain {
    public static void main(String args[]) {
        Circle ob = new Circle();
        ob.cir_area(4.5);
    }
}