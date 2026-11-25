@FunctionalInterface 
interface Calculator { 
    int add(int a, int b);   // One abstract method 
} 
@FunctionalInterface 
interface Greeting { 
    void sayHello(); 
} 
 
class Test { 
public static void main(String[] args) { 
Greeting g = new Greeting() { 
public void sayHello() { 
System.out.println("Hello!"); 
} 
};
g.sayHello(); 
} 
} 
@FunctionalInterface 
interface Greeting { 
void sayHello(); 
} 
//using lambda expression 
class Test1 { 
public static void main(String[] args) { 
Greeting g = () -> System.out.println("Hello!"); 
g.sayHello(); 
} 
}