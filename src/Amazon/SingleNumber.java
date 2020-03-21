package Amazon;

import java.util.Arrays;
import java.util.HashSet;

public class SingleNumber {

    // in an given Array, every element exists twice execpt one - find that single number -- with constant space

    private static Integer findSingleNumber(Integer[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer element : arr) {
            if (set.contains(element)) {
                set.remove(element);
            } else {
                set.add(element);
            }
        }

        for (Integer value: set){
            return value;
        }

        return -1;
    }

    public static void main(String[] args) {
        Integer[] array = {1,2,4,4,2};
        System.out.println(findSingleNumber(array));
    }
}
