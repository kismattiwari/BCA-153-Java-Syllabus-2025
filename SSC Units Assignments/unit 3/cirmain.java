class circle_1
   { 
   double radius, area; 
   double circle_area(double r) 
   { 
   radius=r; 
   area = radius * radius*3.14; 
   return area; 
   } 
   } 
   public class cirmain 
   { 
   public static void main(String args[]) 
   { 
   double ar; 
   circle_1 obj=new circle_1(); 
   ar = obj.circle_area(5.5); 
    System.out.println("Area of circle is "+ar); 
   } 
  }