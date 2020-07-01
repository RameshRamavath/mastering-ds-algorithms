package matrix;

public class DiagonalDiff {

    /*


    Given a square matrix, calculate the absolute difference between the sums of its diagonals.

    For example, the square matrix  is shown below:

        1 2 3
        4 5 6
        9 8 9

    The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is |15-17| = 2


     */

    public static void main(String [] args){


        int [][] inputMatrix = {{1,2,3},
                                {4,5,6},
                                {9,8,9}
        };


        int lenOfMatrix = inputMatrix.length;
        int index = 0;
        int sumD1 = 0;
        int sumD2 = 0;

        while(index<lenOfMatrix){
            sumD1 += inputMatrix[index][index];
            index++;
        }
        index = 0;
        while (index < lenOfMatrix){
            sumD2 += inputMatrix[index][lenOfMatrix-1-index];
            index++;
        }

        int diff = sumD1-sumD2;

        System.out.println(Math.abs(diff));
    }
}
