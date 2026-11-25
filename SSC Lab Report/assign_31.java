import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Students {
    String name;
    int age;

    Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }
}

public class assign_31 {
    public static void main(String[] args) {

        ArrayList<Students> students = new ArrayList<>();

        students.add(new Students("Ram", 22));
        students.add(new Students("Sita", 19));
        students.add(new Students("Hari", 21));

        Collections.sort(students, new Comparator<Students>() {
            public int compare(Students s1, Students s2) {
                return s1.age - s2.age;
            }
        });

        System.out.println("Students sorted by age:");

        for (Students s : students) {
            System.out.println(s);
        }
    }
}