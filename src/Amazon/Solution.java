package Amazon;

import java.util.LinkedHashMap;
import java.util.Map;


public class Solution {

    static String characterCount(String inputString) {

        StringBuffer returnStr = new StringBuffer();
        LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<Character, Integer>();


        char[] strArray = inputString.toCharArray();

        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {

                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {

                charCountMap.put(c, 1);
            }
        }

        for (Map.Entry entry : charCountMap.entrySet()) {
            returnStr.append(entry.getKey().toString() + entry.getValue());
        }

        return returnStr.toString();
    }

    // Driver Code
    public static void main(String[] args) {
        String str = "occurrence";

        System.out.println(characterCount(str));

    }
}

