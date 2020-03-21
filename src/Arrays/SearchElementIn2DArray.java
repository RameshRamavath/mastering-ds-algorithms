package Arrays;

import java.util.Arrays;

public class SearchElementIn2DArray {

    // Note: Elements in 2D array of sorted both by Rows and Columns

    public static boolean search(int [][] array, int element){

        /*

        [1   3  5  7]
        [2   4  6  9]
        [11 13 15 17]

         */

        int rowIndex = 0; // lets start with 1st row
        int colIndex = array[0].length-1; // last column

        while(rowIndex <= array.length && colIndex >= 0){
            if(array[rowIndex][colIndex]== element){
                return true;
            } else if(array[rowIndex][colIndex] > element){
                colIndex--;
            } else {
                rowIndex++;
            }
        }



        return false;
    }

    public static void main(String[] args) {
        // define 2D array
        int[][] inputArray = {
                {1,3,5,7},
                {2,4,6,9},
                {11,13,15,17}};

        System.out.println("First row :: " + Arrays.toString(inputArray[0]));
        System.out.println("Number of columns :: " + inputArray[0].length);
        System.out.println("Number of rows :: " + inputArray.length);

        int element = 2;
        boolean result = search(inputArray, element);

        System.out.println("does element " + element + " present in Array ?? :: " + result);


    }

}
