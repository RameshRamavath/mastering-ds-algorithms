package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Triplets {

    public static void main(String [] args){

        List<Integer> a = new ArrayList<Integer>(Arrays.asList(5,6,7));
        List<Integer> b = new ArrayList<Integer>(Arrays.asList(3,6,10));

        int index = 0;
        List<Integer> result = new ArrayList<>();
        result.add(0,0);
        result.add(1,0);
        while(index<a.size()){
            if(a.get(index) < b.get(index)){
                result.set(1,result.get(1)+1);
            } else if (a.get(index) > b.get(index)){
                result.set(0,result.get(0)+1);
            }
            index++;
        }


        System.out.println(result);
    }
}
