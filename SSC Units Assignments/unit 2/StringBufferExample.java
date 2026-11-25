public class StringBufferExample
{ 
public static void main(String args[]) 
{ 
StringBuffer s=new StringBuffer("test of buffer"); 
System.out.println(s.charAt(2)); 
s.setCharAt(2,'z'); 
System.out.println(s); 
} 
} 