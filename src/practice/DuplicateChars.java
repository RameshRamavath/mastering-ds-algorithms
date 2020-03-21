package practice;

import java.util.*;

public class DuplicateChars {

    static String repeatChars(String str) {

        Map<Character, Integer> counterMap = new HashMap<Character, Integer>();
        char[] charArray = str.toCharArray();
        // System.out.println(Arrays.toString(charArray));
        for (Character ch : charArray) {
            if (ch == ' ')
                continue;
            if (counterMap.containsKey(ch)) {
                counterMap.put(ch, counterMap.get(ch) + 1);
            } else {
                counterMap.put(ch, 1);
            }
        }

        // check chars with two  exactly occurances

        Set<Character> keys = counterMap.keySet();
        // String builder string

        StringBuilder output = new StringBuilder();
        if(counterMap.containsValue(2)){
            for (Character ch : keys) {
                if (counterMap.get(ch) == 2) {
                    output.append(ch+" ");
                }
            }
        } else {
            output.append("No Duplicate");
        }


        // System.out.println("counter map"+ counterMap);
        // System.out.println("output"+ output);

        String finalOutput = output.toString();
        return finalOutput.trim();

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
        System.out.println("my string"+myString);
        String res = repeatChars(myString);
        System.out.println(res);
        scanner.close();
    }
}
