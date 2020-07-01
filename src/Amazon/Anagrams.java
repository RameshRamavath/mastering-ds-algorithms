package Amazon;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {

    // given two strings - if one string is anagram of other if it uses same character's and same quantity

    public static Map<Character, Integer> buildCharMap(String str){

        // check if we have any special chars or space - if so remove from string before building char-map

        Map<Character, Integer> charMap = new HashMap<>();
        String cleanString = str.toLowerCase().replaceAll("[^a-z]","");

        //System.out.println("cleaned string --> " + cleanString);

        for(Character ch: cleanString.toCharArray()){
            if(charMap.containsKey(ch))
                charMap.put(ch,charMap.get(ch)+1) ;
            else
                charMap.put(ch,1);
        }
        return charMap;
    }

    public static boolean checkForAnagrams(String str1, String str2){
        Map<Character,Integer> charMap1 = buildCharMap(str1);
        Map<Character,Integer> charMap2 = buildCharMap(str2);

        // check for equality

        // check if we have same number of distinct keys first

        if(charMap1.keySet().size() != charMap2.keySet().size())
            return false;

        System.out.println("=== MAP CHECKING ====");

        for(Character ch: charMap1.keySet()){
            if(!charMap1.get(ch).equals(charMap2.get(ch)))
                return false;
        }
        return true;
    }


    public static void main(String [] args){
        System.out.println(checkForAnagrams("RAIL! SAFETY!","fairy tales"));
        System.out.println(checkForAnagrams("hi there","there hi"));
        System.out.println(checkForAnagrams("hiabba","hia"));
    }
}



