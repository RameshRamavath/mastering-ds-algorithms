package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {

    // input - Array of non-negative numbers
    // check for duplicates and return array


    // using Set collection  -- we are using extra space O(n)

    static Integer[] deDup(Integer[] array){

        HashSet<Integer> result = new HashSet<>();

        for(int i=0; i< array.length; i++){
            result.add(array[i]);
            }
        return result.toArray(new Integer[]{});
    }


    // Sorted Array - Collections can't be used - Use another Array to story the non-duplicate numbers

    static Integer[] removeDup(Integer[] array){
        int j=0;
        Integer [] result = new Integer[array.length];
        for(int i=0; i< array.length-1; i++){
            if(array[i] != array[i+1]){
              result[j++] = array[i];
            }
        }
        result[j]=array[array.length-1];

        return result;
    }



    public static void main(String[] args) {

        Integer[] array = {40,5,5,6,6,9,60};
        Integer[] res = deDup(array);

        System.out.println(Arrays.toString(res));

        // sorted array
        Integer[] orgArray = {3,5,6,6,9,9,10,10};
        Integer[] result = removeDup(orgArray);

        System.out.println(Arrays.toString(result));

    }
}
