package Arrays;

import java.util.TreeSet;

public class SqaureOfElements {

    // given sorted elements in Array - return Array with square of all the elements [ans should be sorted]

    public static TreeSet<Integer> square(Integer[] array) {

        TreeSet<Integer> result = new TreeSet<>();

        for (Integer element : array) {

            Integer sq = element*element;
            boolean isPresent = result.contains(sq);

            if (isPresent) {
                System.out.println("element already present");
            } else {
                result.add(sq);
            }
        }

        return result;


    }

    public static void main(String[] args) {

        Integer[] array = {-2,-1,0,2,6};
        System.out.println(square(array));

    }
}
