interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with a key");
    }
}

public class interface_example_5 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }
}