public class demoofinnerclass { 
int x; 
void outdisp() 
{ x=100; 

 
         System.out.println("outer class value is " +x); 
     } 
        class inner 
        { 
             int y; 
            void innerdisp() 
            {y=200; 
                System.out.println("inner class  value is " +y); 
            } 
        } 
    public static void main(String s[]) 
    { 
        demoofinnerclass outobj=new demoofinnerclass(); 
            demoofinnerclass.inner inobj= outobj.new inner(); 
            outobj.outdisp(); 
            inobj.innerdisp();             
    } 
} 
