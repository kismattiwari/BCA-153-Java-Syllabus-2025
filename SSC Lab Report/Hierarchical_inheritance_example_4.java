class Animal_2 {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog_2 extends Animal_2 {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal_2 {
    void meow() {
        System.out.println("Cat meows");
    }
}

class Hierarchical_inheritance_example_4 {
    public static void main(String[] args) {
        Dog_2 d = new Dog_2();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}