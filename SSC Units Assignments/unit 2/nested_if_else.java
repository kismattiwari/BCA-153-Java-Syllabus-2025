class nestedif 
 
{ 
public static void main(String s[]) 
{ 
String result; 
 int avgmark=62; 
 if(avgmark> 50) 
  if(avgmark>=60) 
  if(avgmark>=75) 
   result="distinction"; 
  else 
  result="first class"; 
 else 
 result="second class"; 
else 
result="third class"; 
   
  if(avgmark<50) 
  System.out.println("failed"); 
else 
System.out.println("passed with"+result);       
}  
}