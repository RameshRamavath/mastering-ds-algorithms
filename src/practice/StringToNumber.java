package practice;

public class StringToNumber {

    public static void parseInt(String str){

        while (str.length() !=1){
            Integer integer = Integer.parseInt(str);
            System.out.println();
        }

    }

    public static void main( String[] args){
        System.out.println(Integer.parseInt("1245"));
    }
}
