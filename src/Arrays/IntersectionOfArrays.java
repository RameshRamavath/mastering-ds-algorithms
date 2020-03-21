package Arrays;

import java.util.ArrayList;

public class IntersectionOfArrays {


    static ArrayList<Integer> findIntersection (int [] array1, int [] array2){

        ArrayList<Integer>  result = new ArrayList<>();

        // pointers
        int x = 0;
        int y = 0;

        while(x < array1.length && y < array2.length){

            if(array1[x] == array2[y]){
                result.add(array1[x]);
                x++; y++;
            } else if (array1[x] < array2[y]){
                x++;
            } else {
                y++;
            }
        }

        return result;

    }

    public static void main(String[] args) {

        int [] array1 = {3,6,7,8,10};
        int [] array2 = {4,7,9,10,12};

        ArrayList<Integer> result = findIntersection(array1,array2);

        System.out.println(result);

    }

}
