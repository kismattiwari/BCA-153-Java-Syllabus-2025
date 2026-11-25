public class return_statement { 
   public int add() { // without arguments 
int x = 30; 
int y = 70; 
int z = x+y; 
return z; 
} 
public static void main(String args[]) { 
return_statement test = new return_statement(); 
int add = test.add(); 
System.out.println("The sum of x and y is: " + add); 
} 
}