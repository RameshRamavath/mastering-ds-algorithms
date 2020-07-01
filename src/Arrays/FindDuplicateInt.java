package Arrays;

public class FindDuplicateInt {

    public static Integer findIndexOFDuplicate (Integer[] input){

        int n = input.length-1;
        int nSum = (n*(n+1)/2);

        int sum = 0;
        for(Integer ele: input){
            sum +=ele;
        }

        int delta = sum-nSum;

        // get the index of second occurrence
        int counter = 0;
        int reqIndex = 0;

        for(int i=0; i<input.length; i++){
            if(input[i]==delta){
                counter++;
            }
            if(counter ==2){
                reqIndex = i;
                break;
            }
        }

        return reqIndex;
    }

    public static void main (String [] args){
        Integer[] arr = {1,5,3,5,2,4};
        System.out.println(findIndexOFDuplicate(arr));
    }

}
