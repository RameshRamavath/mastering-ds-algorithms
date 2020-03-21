package practice;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArray {

    static void pepareTwoDimArray(){

        Scanner sc = new Scanner(System.in);

        // initialize two array

        int [][] twoDimArray = new int[2][2];

        for (int i=0; i<2; i++){

            System.out.println(" enter two numbers with space in b/w");

            String line = sc.nextLine();
            String [] arrItems = line.split(" ");
            for(int j=0; j<2; j++){
                int arrItem = Integer.parseInt(arrItems[j]);
                twoDimArray[i][j]=arrItem;
            }
        }

        // check two dim array - loop over each row to print final array

        for(int [] array: twoDimArray){
            System.out.println(Arrays.toString(array));
        }


    }

    public static void main(String[] args){

        pepareTwoDimArray();
    }

}
