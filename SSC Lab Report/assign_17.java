class NumberThread_1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
    }
}

class NepalThread_1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Nepal");
        }
    }
}

public class assign_17 {
    public static void main(String[] args) {
        NumberThread_1 t1 = new NumberThread_1();
        NepalThread_1 t2 = new NepalThread_1();

        t1.start();
        t2.start();
    }
}