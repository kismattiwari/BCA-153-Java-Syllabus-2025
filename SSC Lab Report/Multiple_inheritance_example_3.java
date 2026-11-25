interface A {
    void showA();
}

interface B {
    void showB();
}

class C implements A, B {
    public void showA() {
        System.out.println("Interface A");
    }

    public void showB() {
        System.out.println("Interface B");
    }
}

class Multiple_inheritance_example_3 {
    public static void main(String[] args) {
        C obj = new C();
        obj.showA();
        obj.showB();
    }
}