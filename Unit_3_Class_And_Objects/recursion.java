package Unit_3_Class_And_Objects;
// recursion example
public class recursion {
    static int fact (int n) {
        //base case
        if(n==0 || n==1)
        {
            return 1;
        }
        else {
            return n*fact(n-1); //recursive case
        }

    }
        public static void main (String[] args){
         int result = fact(6);
         System.out.println("Factorial : "+ result);   
        }
}
