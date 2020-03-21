package Amazon;

public class GetSquareMatrix {

/*    public static void possibleMatrix(int[][] inputMatrix){
        for (int i = 0; i < ; i++) {

        }
    }*/

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4, 5},
                {10, 12, 15, 18, 20},
                {31, 35, 37, 13, 43}};

        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int j=0; j< rows ; j++ ){
            for(int i=0; i< rows ; i++){
                System.out.println(matrix[j][i]);
            }

        }

       /* System.out.println(rows);
        System.out.println(cols);*/

    }

}
