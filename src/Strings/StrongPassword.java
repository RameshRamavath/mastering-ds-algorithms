package Strings;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class StrongPassword {


    /*

        numbers = "0123456789"
        lower_case = "abcdefghijklmnopqrstuvwxyz"
        upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        special_characters = "!@#$%^&*()-+"

            Its length is at least 6
            It contains at least one digit.
            It contains at least one lowercase English character.
            It contains at least one uppercase English character.
            It contains at least one special character. The special characters are: !@#$%^&*()-+


     */


    static int minimumNumber(int n, String password) {

        // Return the minimum number of characters to make the password strong

        int counter = 0;

        // Pattern class is main for regular expressions in Java

        String dMatch = "[0-9]";
        String lMatch = "[a-z]";
        String uMatch = "[A-Z]";
        String rMatch = "!@#$%^&*()-+";


        if (!Pattern.matches(password,dMatch)) {
            counter += 1;
        }
        if (!Pattern.matches(password,lMatch)) {
            counter += 1;
        }
        if (!Pattern.matches(password,uMatch)) {
            counter += 1;
        }
        if (!Pattern.matches(password,rMatch)) {
            boolean isYes = !Pattern.matches(password,rMatch);
            counter += 1;
        }

        return counter > n-counter ? counter : n-counter;
    }

    public static void main(String[] args) {

        String password = "Ab1";
        System.out.println(minimumNumber(3, password));
        /*System.out.println(minimumNumber(11, "#HackerRank"));
        System.out.println(minimumNumber(4, "4700"));*/
    }
}

