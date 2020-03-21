package practice;

public class LargestNumber {


    // find largest number
    static void largestNumber (int arr[]){

        if(arr.length == 0){
            System.out.println("Invalid input");
        }
        // init min value
        int currentMax = Integer.MIN_VALUE;

        for(int i=0; i< arr.length; i++){
            if(arr[i] > currentMax){
                currentMax = arr[i];
            }
        }

        System.out.println("Largest number :: " + currentMax);

    }


    // find second largest number

    static void secondLargestNum (int arr[]){
        if(arr.length <2){
            System.out.println("Invalid input");
        }

        // init first and second largest numbers

        int firstMax = arr[0];
        int secondMax = arr[0];

        for(int i=1; i < arr.length ; i++){

            if(arr[i] > firstMax){
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr [i] > secondMax && arr[i] != firstMax){
                secondMax = arr[i];
            }
            System.out.println("iteration :: " + i + " largest num :" + firstMax + " -- second largest num :: "+ secondMax);
        }
        System.out.println("largest num :" + firstMax + " -- second largest num :: "+ secondMax);
    }


    // nth largest number

    public static void main(String[] args) {
        int [] numArray = {16,3,5,99,165,10,5,888};
        int [] emptArray = {};

       // largestNumber(emptArray);

        largestNumber(numArray);

        secondLargestNum(numArray);
    }
}
