package Strings;

import java.io.*;

public class SuperReducedString {


    // Complete the superReducedString function below.
    private static String superReducedString(String s) {

        int index = 0;
        StringBuilder str = new StringBuilder(s);
        while (str.length() > 0 && index< str.length()-1) {
            if(str.charAt(index) == str.charAt(index+1)){
                str.delete(index,index+2);
                index = 0;
            } else {
                index++;
            }
        }
        return str.length() == 0 ? "Empty String" : str.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();
        String result = superReducedString(s);
        System.out.println(result);
        bufferedReader.close();
    }
}


