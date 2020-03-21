package practice;

import java.util.Arrays;

public class Fibonacci {

    // write method for finding fibonacci number
    // recursion method

     static int fib(int number) {

         if (number <= 1)
             return number;
         return fib(number - 2) + fib(number - 1);

     }

    // with memory optimization

    static int fibDp(int n){
         // define a array to hold values
        int fibArry [] = new int[n + 1];
        fibArry[0]=0;
        fibArry[1]=1;

        for(int i=2; i<=n; i++){
            fibArry[i]= fibArry[i-1]+fibArry[i-2];
            System.out.println(Arrays.toString(fibArry));
        }

         return fibArry[n];
    }


    static int fibOptimization(int n){
         int a = 0;
         int b = 1;
         int c = 0;

         if (n==0)
             return a;
         for(int i=2; i<=n; i++){

             System.out.println(String.format("a %d, b %d and c %d",a,b,c));
             c = a+b;
             a = b;
             b = c;

         }
        return b;
    }

    public static void main(String [] args){
        // create obj of fib
        int nth_num = fib(1);
        System.out.println("nth number is -- " +  nth_num);

        // calling dynamic implementation

        int nthFib = fibDp(5);
        System.out.println("nth fib number is -- " +  nthFib);

        // calling optimization

        int fibOpt = fibOptimization(5);
        System.out.println("nth fib number is -- " +  fibOpt);



    }
}

