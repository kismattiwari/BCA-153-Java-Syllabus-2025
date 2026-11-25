package Unit_3_Class_And_Objects;
//this keyword example
public class thiskey {
    String name; //instant variable
    int age;

    thiskey(String name , int age){ //local variable
        this.name=name;
        this.age=age;
    }
    
    public static void main ( String[] args ) {
        thiskey obj = new thiskey("Kismat Tiwari",18);
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
