package Amazon;

public class MissingNumber {

    private static Integer findMissingNumber(Integer[] input){
        int len = input.length+1;

        Integer sum = (len*(len+1))/2;

        Integer temSum = 0;

        for (Integer ele: input){
            temSum+=ele;
        }

        System.out.println(temSum);

        Integer missing = sum-temSum;
        return missing;
    }

    public static void main(String[] args) {
        Integer[] input = {1,2,3,5};

        System.out.println(findMissingNumber(input));
    }
}
