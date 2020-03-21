package Arrays;

public class SubArrayWithGivemSum {



    public static int getSubArray(int[] array, int sum){

        // start from zero'th element and continue adding elements till reach the sum

        // if at any given point if sumOfElements is greater than Sum -- start removing elements from current start

        int current_start = 0; // start from 0th index
        int current_sum = array[0];

        int i;

        for(i=1 ; i< array.length ; i++){

            // check if current sum if greater than required sum

            while(current_sum > sum && current_start < i-1){
                current_sum = current_sum - array[current_start];
                current_start++;
            }

            // else check if current_sum is equal to required sum

            if(current_sum == sum){

                System.out.println("the indexes are from  " + current_start + " to " + (i-1));
                return 1;
            }

            if(i< array.length) {
                current_sum = current_sum + array[i];
            }
            System.out.println("iteration :: "+ i + " and current_sum :: "+ current_sum);
        }


        return 0;
    }

     public static void main(String[] args) {

        int [] array = {1, 4, 20, 3, 10, 5};
        int sum = 33;

        getSubArray(array,sum);

        int [] array2 = {1, 4, 0, 0, 3, 10, 5};
        int sum2 = 7;

        getSubArray(array2, sum2);

/*        for(int i=0; i< array.length; i++){
            for(int j=i+1; j<array.length; j++){

                System.out.println(" " + array[i] + " :: " + array[j]);

            }
        }*/

    }

}
