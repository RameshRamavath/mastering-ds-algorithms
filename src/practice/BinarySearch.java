package practice;

public class BinarySearch {

    // given an sorted array of integers - find whether an element exists in given array or not!

    static int numExists(int [] arr, int num){
        int size = arr.length;
        if (size == 0)
            return -1;
        int start =0;
        int end = size-1;
        int mid = (start+end)/2;

       // System.out.println("start - "+ start + " mid - "+ mid + " end - "+ end);

        while (start <= end){

            System.out.println("start - "+ start + " mid - "+ mid + " end - "+ end);
            if(arr[mid]==num)
                return mid;
            else if (arr[mid] < num)
                start = mid+1;
            else
                end = mid-1;

            mid = (start+end)/2;
        }

        return -1;

    }

    // main program

    public static void main(String[] args) {
        // input array

        int[] arr = {1,2,4,5,7};
        int result = numExists(arr,7);

        System.out.println("result index - " + result );
    }
}
