import java.io.*; 
public class tochararrayexample
{ 
public static void main(String args[]) 
{  
String strng = new String("Welcome to BKC"); 
char[] array= strng.toCharArray(); 
System.out.println("Content of Array:"); 
for(char c: array) 
{ 
System.out.print(c); 
} 
} 
}