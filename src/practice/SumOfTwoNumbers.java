package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SumOfTwoNumbers {

    // given an total/sum find all the indexes of numbers which sums to given total/sum in a given array

    private static void twoNumbersSum(int [] array, int sum){

        int sumOfNumbers =0;

        for(int i=0; i< array.length; i++){
            for (int j= i+1; j< array.length; j++){
                sumOfNumbers = array[i]+array[j];
                if(sumOfNumbers == sum){
                    System.out.println("indexes are -- "+ i + " and " + j);
                }
            }
        }

    }


    private static void twoNumbersSum2(int [] array, int sum){


        Map<Integer,Integer> numMap = new HashMap<>();

        for(int i=0; i< array.length; i++){

            int complement = sum - array[i];
            if(numMap.containsKey(complement)){
                System.out.println(String.format("indexes are %d and %d ", i, numMap.get(complement)));
            }
            numMap.put(array[i],i);
        }
    }



    private static boolean twoNumbersSum3(int [] array, int sum){


        HashSet<Integer> numbers = new HashSet<Integer>();

        for(int i=0; i< array.length; i++){

            int complement = sum - array[i];
            if(numbers.contains(complement)){
                return true;
            }
            numbers.add(array[i]);
        }
        return false;
    }

    public static void main(String [] args){

        int [] array = {1,2,5,5};

        twoNumbersSum(array, 7);

        twoNumbersSum2(array, 6);

        boolean result = twoNumbersSum3(array, 6);

        System.out.println(result);


    }

}
