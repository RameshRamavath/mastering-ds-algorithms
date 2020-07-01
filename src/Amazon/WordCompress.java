package Amazon;

public class WordCompress {

    /*

       given a string and integer k -- compress word by looking for consecutive same k chars

       example : word - abbcccb, k = 3

       stage 1 - abbb
       stage 2 - a

       result - a
      */


    public static String compress(String str, Integer k){

        int point1 = 0;
        int point2 = 1;

        StringBuilder strB = new StringBuilder(str);

        while(strB.length()>0 && point2 < strB.length()){
            if(strB.charAt(point1) == strB.charAt(point2)){
                point2++;
            } else {
                point1++;
                point2++;
            }
            if(point2-point1 == k){
                strB.delete(point1,point2);
                 point1 = 0;
                 point2 = 1;
            }

            //System.out.println(strB.toString());
        }

        return strB.toString();
    }

    public static void main( String[] args){
        String input = "abbcccb";

        System.out.println(compress(input,3));

    }
}
