class Student {
    public int a = 10;
    private int b = 20;
    protected int c = 30;
    int d = 40;   // default

    void display() {
        System.out.println("Public: " + a);
        System.out.println("Private: " + b);
        System.out.println("Protected: " + c);
        System.out.println("Default: " + d);
    }
}

public class access_specifiers_example_6 {
    public static void main(String[] args) {
        Student s = new Student();

        s.display();

        System.out.println("Public: " + s.a);
        System.out.println("Protected: " + s.c);
        System.out.println("Default: " + s.d);

        // System.out.println(s.b);  // Error: private
    }
}