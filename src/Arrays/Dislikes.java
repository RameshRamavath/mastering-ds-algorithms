package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Dislikes {

    public static int countDislike(String str1, String str2){
        int count =0 ;
        if(str1.length() != str2.length()){
            return -1;
        } else {

            for (int i =0; i< str1.length(); i++){
                if(str1.charAt(i) == str2.charAt(i)){
                    count++;
                }
            }
        }

        return count;

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();                // Reading input from STDIN
        String str2 = br.readLine();
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
     /*   Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();                 // Reading input from STDIN
        String str2 = s.nextLine();                 // Reading input from STDIN

        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT*/

        System.out.println(countDislike(str1,str2));
    }

}
