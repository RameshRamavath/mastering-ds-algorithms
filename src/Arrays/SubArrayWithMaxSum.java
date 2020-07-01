package Arrays;

public class SubArrayWithMaxSum {

    // given an array get the sub-array with max-sum

    // [1,-3, 2, 1,-1] --> [2,1] -- is the sub array with max sum

    public static void maxSubArray(Integer[] arr){

        int maxSum = arr[0]; // start with smallest number
        int i =0;
        int j =1;

        while (j< arr.length){
            if((maxSum + arr[j] > maxSum) ){
                maxSum = arr[j];
                i++;
                j++;
            }

        }

    }

}
