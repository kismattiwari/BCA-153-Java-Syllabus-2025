public class DivideDemo2 { 
public static void main(String[] args) { 
int a = 10, b = 0; 
try { 
int result = a / b; 
System.out.println(result); 
} 
catch (ArithmeticException e) { 
            System.out.println("Cannot divide by zero: " + e.getMessage()); 
        } 
        System.out.println("Program continues normally..."); 
    } 
}