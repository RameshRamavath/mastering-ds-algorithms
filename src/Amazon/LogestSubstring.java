package Amazon;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LogestSubstring {

    /*

        Given a string - return the longest substring without repeating character

        ex: abcabcbb --> abc
            bbb      --> b
            pwwkew   --> wke

     */

    public static void longestSubString(String str){

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        int p1 = 0;
        int p2 = 0;

        int index = 0;

        int max_len = Integer.MIN_VALUE;

        while(p2 < str.length()){
            if(set.add(str.charAt(index))){
                max_len = Math.max(max_len, (p2-p1+1));
                index++;
                p2++;
            } else{
                set.remove(str.charAt(p1));
                p1++;
            }
        }

        System.out.println("max length string -- " + max_len);
        System.out.println("indexes -- " + p1 + "-- "+ p2);
    }

    public static void main(String[] args) {
       longestSubString("abcabcbb");
       longestSubString("bbbb");
       longestSubString("pwwkew");

    }


}
