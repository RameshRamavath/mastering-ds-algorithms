package practice;

import java.util.HashSet;

public class Duplicates {
    // given an Array print all duplicate numbers

    private static void printDuplicates(Integer[] array){
        HashSet<Integer> set = new HashSet<>();
        for(Integer ele : array){

            System.out.println(set.add(ele));
           /* if(!set.add(ele)){
                System.out.println(ele);
            }*/
        }

        System.out.printf("Set" + set);
    }


    public static void main(String[] args) {
        Integer[] input = {10,10,1,2,3,4,4};
        printDuplicates(input);
    }
}
