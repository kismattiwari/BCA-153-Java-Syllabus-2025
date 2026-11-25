interface Math {
    void get_area_of_circle();
    void get_perimeter_of_circle();
}

class Circle implements Math {
    double radius = 5;

    public void get_area_of_circle() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }

    public void get_perimeter_of_circle() {
        double perimeter = 2 * 3.14 * radius;
        System.out.println("Perimeter of Circle = " + perimeter);
    }
}

public class assign_9 {
    public static void main(String[] args) {
        Circle c = new Circle();

        c.get_area_of_circle();
        c.get_perimeter_of_circle();
    }
}