public class equalsversus 
{ 
public static void main(String args[]) 
{ 
String s1="ram"; 
String s2="ram"; 
System.out.println(" equals is"+s1.equals(s2)); 
System.out.println(" == "+(s1==s2)); 
} 
} 

class stringdemo 
{ 
public static void main(String args[]) 
{ 
String s1="ram"; 
String s2 =new String(s1); 
System.out.println(" s1 is "+s1); 
System.out.println(" s2 is "+s2); 
System.out.println(" equals is"+s1.equals(s2)); 
System.out.println(" == "+(s1==s2)); 
} 
}