package Unit_3_Class_And_Objects;
// copy constructor example
public class Students {
    String name;
    int age;
     
    Students(String n , int a ) {
        name=n;
        age=a;
    }

    Students (Students s){
        name = s.name;
        age=s.age;
    }
    
    public static void main (String[] args) {
        Students s1 = new Students ("Kismat Tiwari",18);
        Students s2 = new Students(s1);
        System.out.println(s2.name +" " + s2.age );
    }
    
}
