package Amazon;

import java.util.Stack;

public class BalancedParanthesis {

    public static boolean checkForBalance(String str) {

        int index = 0;
        boolean isBalance = true;
        Stack<Character> stack = new Stack<>();

        while (index < str.length()) {

            if (str.charAt(index) == '{' || str.charAt(index) == '[' || str.charAt(index) == '(') {
                stack.add(str.charAt(index));
                index++;
            } else if (stack.peek() == '{' && str.charAt(index) == '}') {
                stack.pop();
                index++;
            } else if (stack.peek() == '[' && str.charAt(index) == ']') {
                stack.pop();
                index++;
            } else if (stack.peek() == '(' && str.charAt(index) == ')') {
                stack.pop();
                index++;
            } else {
                isBalance = false;
                break;
            }
        }

        if(stack.size() != 0){
            isBalance = false;
        }

        return isBalance;

    }

    private static boolean balanceCheck(String string) {

        StringBuilder str = new StringBuilder(string);
        int index = 0;

        while (str.length() >= 2 && index < str.length()-1) {
            if ((str.charAt(index) == '{' && str.charAt(index + 1) == '}') || (str.charAt(index) == '(' && str.charAt(index + 1) == ')') || (str.charAt(index) == '[' && str.charAt(index + 1) == ']')) {
                str.delete(index, index + 2);
                index =0;
            } else
                index++;

        }
        return str.length() == 0 ? true : false;
    }

    public static void main(String[] args) {

        System.out.println(checkForBalance("{}()[]"));
        System.out.println(checkForBalance("({[]})"));
        System.out.println(checkForBalance("{{()}}[]"));
        System.out.println(checkForBalance("[]{}(){(})"));
        System.out.println(checkForBalance("[]{"));
        System.out.println(checkForBalance("[()}"));
    }
}
