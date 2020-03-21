package practice;

public class NumbersGame {

    // how to iterate over chars in Integer

    public static void main(String[] args) {


        int number = 12789;
        int len = String.valueOf(12789).length();

        for (int i =0; i< len; i++){

            System.out.println(number%10);
            number = number/10;
        }

    }
}
