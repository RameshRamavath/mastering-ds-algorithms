package practice;

import java.util.ArrayList;
import java.util.List;

public class Staircase {


    public static void buildCase(int size){
        int i = 0;
        while (i < size){
            StringBuilder str = new StringBuilder();
            int j=0;
            while (j<size-i){
                str.append(" ");
                j++;
            }
            while(j<=size) {
                str.append("#");
                j++;
            }
            System.out.println(str.toString());
            i++;
        }
    }


    public static Integer sum(List<Integer> numbers){
        int sum =0;
        for(Integer ele: numbers){
            sum += ele;
        }

        return sum;
    }


    public static void main(String []args){

        List<Integer> nm = new ArrayList<>();
        nm.add(1);
        nm.add(2);
        nm.add(3);
        nm.add(4);
        nm.add(5);

        for (Integer el: nm){
            nm.remove(el);
            System.out.println(sum(nm));
        }

    }

}
