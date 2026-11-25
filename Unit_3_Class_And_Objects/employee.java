package java_bca_nepal;

public class employee {
    String Name;
    int ID;
    double Salary;

    //parameterized constructor 
    employee(String Name,int ID ,double Salary){
        this.Name=Name;
        this.ID=ID;
        this.Salary=Salary;
    }

    //method to display employee

    void display()
    {
        System.out.println("Employee Name : "+Name);
        System.out.println("Employee ID : "+ID);
        System.out.println("Employee Salary : "+Salary);
    }

    // create and display two employee objects

    public static void main (String[] args)
    {
        //create two employee objects 
         employee obj1 = new employee("ram",100,10000);
         employee obj2=new employee("sita",101,11000);
         // display two employee objects
         obj1.display();
         obj2.display();
    }
    
}
