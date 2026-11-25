class NepalThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Nepal");
        }
    }
}

public class assign_16 {
    public static void main(String[] args) {
        NepalThread t = new NepalThread();
        t.start();
    }
}