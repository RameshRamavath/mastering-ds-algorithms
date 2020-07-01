package Amazon;

import java.util.*;

public class Result {

    public static boolean isAnagram(String word1,String word2) {

        if(word1.length() != word2.length())
            return false;

        HashMap<Character, Integer> frequencyMap1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> frequencyMap2 = new HashMap<Character, Integer>();


        for (Character ch : word1.toCharArray()) {
            if (frequencyMap1.containsKey(ch))
                frequencyMap1.put(ch, frequencyMap1.get(ch) + 1);
            else
                frequencyMap1.put(ch, 1);
        }

        for (Character ch : word2.toCharArray()) {
            if (frequencyMap2.containsKey(ch))
                frequencyMap2.put(ch, frequencyMap2.get(ch) + 1);
            else
                frequencyMap2.put(ch, 1);
        }

        return frequencyMap1.equals(frequencyMap2);
    }

    public static List<String> funWithAnagrams(List<String> text){


        Collections.sort(text, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()> o2.length()){
                    return -1;
                } else if(o1.length() < o2.length()) {
                    return 1;
                } else
                    return 0;
            }
        });

        int i=0;
        while (i< text.size()-1){
            boolean isAn = isAnagram(text.get(i), text.get(i+1));

            if(isAn){
                text.remove(i+1);
            } else {
                i++;
            }
        }

        //Collections.sort(text);


    return text;

    }

    public static void main(String[] args) {

        ArrayList<String>  input  = new ArrayList<>();
        input.add("code");
        input.add("aaagmnrs");
        input.add("anagrams");

        input.add("doce");


        System.out.println(funWithAnagrams(input));
    }
}
