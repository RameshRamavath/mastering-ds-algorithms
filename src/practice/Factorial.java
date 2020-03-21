package practice;

public class Factorial {

    // using for loop
    static int factorialValue(int n){
        if (n== 0)
                return 1;
        else {
            int factorial = 1;
            for (int i=1; i<=n; i++){
                factorial = factorial*i;
                System.out.println(String.format("current factorial value at %d is %d", i, factorial));
            }
            return factorial;

        }
    }

    // using recursion

    static int factorialRecursion(int n){
        if (n==0)
                return 1;
        return  n * factorialRecursion(n-1);
    }

     public static void main(String[] args) {
        // calling factorialValue

        int final_value = factorialValue(5);
        System.out.println("Using for loop - "+ final_value);

         // calling recursion method
         int final_value2 = factorialValue(5);
         System.out.println("Using recursion - "+ final_value2);

    }

}
