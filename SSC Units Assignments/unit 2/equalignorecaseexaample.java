public class equalignorecaseexaample 
{ 
public static void main(String args[]) 
{ 
String ss[]={"Ram","shyam","hari","suresh"}; 
String s= "rama"; 
int i,found=-1; 
for(i=0;i<4;i++) 
{ 
if(ss[i].equalsIgnoreCase(s)) 
{ 
System.out.println("Name is found"); 
found=1; 
break; 
}  
} 
if(found==-1) 
{ 
}  
System.out.println("name does not found"); 
}  
}