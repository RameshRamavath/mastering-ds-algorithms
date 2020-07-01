package practice;

public class PlusMinus {

    public static void main(String [] args){

        int[] arr = {-4 ,3 ,-9, 0, 4, 1};

        double sumPositive=0; double sumZero=0; double sumNegative=0;
        int len = arr.length;
        for(int ele: arr){
            if(ele < 0){
                sumNegative = sumNegative+1;
            } else if(ele > 0){
                sumPositive = sumPositive+ 1;
            } else{
                sumZero =sumZero+1;
            }
        }

        System.out.format("%.6f",sumPositive/len).println();
        System.out.format("%.6f",sumNegative/len).println();
        System.out.format("%.6f",sumZero/len).println();

    }


}
