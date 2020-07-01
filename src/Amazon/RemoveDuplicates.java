package Amazon;


import java.util.*;

public class RemoveDuplicates {

    // remove duplicates from sorted array with out any extra space

    public static ArrayList<Integer> remove(Integer[] input) {

        int pointer = 0;

        ArrayList<Integer> numbers = new ArrayList<>();

        Collections.addAll(numbers,input);
        //List numbers = Arrays.asList(input);

        while (pointer < numbers.size() - 1) {
            if (numbers.get(pointer).equals(numbers.get(pointer+1))) {
                numbers.remove(pointer+1);
            } else
                pointer++;
        }
        return numbers;

    }

    public static void main( String[] args){
        Integer[] input = {1,1,1,2,2,3};
        Integer[] input1 = {1,1,1,2,2,3,7,7,9};

        System.out.println(remove(input));
        System.out.println(remove(input1));


    }
}
