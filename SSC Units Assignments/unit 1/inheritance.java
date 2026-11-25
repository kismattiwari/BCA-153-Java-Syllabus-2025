import java.util.Scanner;

class person
{
    String pname,padd;
    protected void p_get()
    {
        Scanner input = new Scanner (System.in);
        System.out.println("enter name and address");
        pname = input.nextLine();
        padd = input.nextLine();
    }
         protected void p_display()
         {
            System.out.println("name is "+pname);
            System.out.println("address is "+padd);

        }

}
    class employee extends person 
    {
        int salary;
        Scanner input;

        public void e_get()
        {
            input= new Scanner (System.in);
            p_get();
            System.out.println("enter salary");
            salary = input.nextInt();
        }

        public void e_display()
        {
            p_display();
            System.out.println("salary is "+salary);
        }
    }

    public class inheritance 
    {
        public static void main(String args[])
        {
            employee eobj = new employee();
            eobj.e_get();
            eobj.e_display();
        }
    }