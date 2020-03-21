package Amazon;

import java.util.HashSet;

public class FirstDuplicate {

    public Integer getFirstDuplicate(Integer[] input){
        HashSet<Integer> set = new HashSet<>();
        for(Integer element: input){
            if(set.contains(element)){
                return element;
            } else {
                set.add(element);
            }
        }
        return -1;
    }

    public static void main(String[]args){
        Integer[] input = {-2,-1,-3,5,-3,2};
        Integer[] input2 = {1,2,1,2,3,3};
        Integer[] input3 = {2,1,3,5,3,2};
        Integer[] input4 = {1,2,3,4,5,6};

        FirstDuplicate obj = new FirstDuplicate();

        System.out.println(obj.getFirstDuplicate(input));
        System.out.println(obj.getFirstDuplicate(input2));
        System.out.println(obj.getFirstDuplicate(input3));
        System.out.println(obj.getFirstDuplicate(input4));
    }

}
