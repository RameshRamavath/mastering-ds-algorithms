package Amazon;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {
    // return the index // return -1 if not found

    // used linked HashMap

    public static Integer find(String str) {

        LinkedHashMap<Character, ArrayList<Integer>> map = new LinkedHashMap<>();

        int index = 0;

        for (Character element : str.toCharArray()) {
            if (map.containsKey(element)) {
                // update the arrayList
                map.get(element).add(index);
            } else {
                ArrayList<Integer> indexToAdd = new ArrayList<Integer>();
                indexToAdd.add(index);
                map.put(element, indexToAdd);
            }
            index++;
        }


        System.out.println(map);
        // iterate through the HashMap and retrun the first key whose value has size 1;

        for (Map.Entry<Character, ArrayList<Integer>> ele : map.entrySet()){
            if(ele.getValue().size() ==1){
                return ele.getValue().get(0);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String input = "leetcode";
        Integer result = find(input);
        System.out.println(result);

        System.out.println(find("loveleetcode"));
        System.out.println(find("code"));
        System.out.println(find("aabb"));


        System.out.println(find("aaabcccdeeef"));


    }
}
