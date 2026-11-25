public class getcharsdemo 
{ 
public static void main(String args[]) 
{ 
String ss="We are student of oxford college"; 
int start=3; 
int end=14; 
char ret[]=new char[end-start]; 
ss.getChars(start,end,ret,0); 
System.out.println(ret); 
} 
}