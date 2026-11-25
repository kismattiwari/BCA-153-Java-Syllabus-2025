package Unit_3_Class_And_Objects;
//parameterized constructor example
public class para {
    String name;
    int age;

    para(String n,int a){
        name=n;
        age=a;
    }

    public static void main (String[] args){
        para p1 = new para("Kismat Tiwari",18);
        System.out.println(p1.name);
        System.out.println(p1.age);
    }
}
