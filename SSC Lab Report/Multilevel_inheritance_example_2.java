class Animal_1 {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog_1 extends Animal_1 {
    void bark() {

        System.out.println("Dog barks");
    }
}

class Puppy extends Dog_1 {
    void play() {
        System.out.println("Puppy plays");
    }
}

class Multilevel_inheritance_example_2 {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.play();
    }
}