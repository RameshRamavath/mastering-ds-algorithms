package Amazon;

import java.util.ArrayList;
import java.util.HashSet;

public class ShortestSubstring {

    /*
      given a string - return substring with shortest that contains all the characters in String

      example: s = dabbcabcd -- all characters [a,b,c,d]

      possible substrings  - dabbc, abcd

      shortest and required ans ==>   abcd

      example2:  abb ==> ab
      example3: aabcbcdb ===> abcbcd

      */

    public static void shortestString(int a, int b) {
        int x = a;
        int y  = b;

        while (true){
            if(x>y){
                x = x-y;
            } else if(x <y){
                y = y-x;
            } else if(x==y){
                break;
            }
        }

        System.out.println(x);

        System.out.println(y);




    }

    public static void main(String[] args) {


        shortestString(2437,875);
    }
}
