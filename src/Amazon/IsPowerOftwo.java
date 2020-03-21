package Amazon;

public class IsPowerOftwo {

    private static boolean isPowerOfTwo(Integer num){
        int currentNumber = 2;
        while (currentNumber < num){
            currentNumber = currentNumber*2;

            System.out.println(currentNumber);
        }

        return currentNumber == num;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(164));

        System.out.println(isPowerOfTwo(6));
    }
}
