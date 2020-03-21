package practice;

public class ReverseString {

    static void reverse(String str){
        String final_str = "";
        for(Character ch: str.toCharArray()){
            final_str = ch+final_str; // each time one String instance is created - hence better to use String builder
        }
        System.out.println("reversed string :: " + final_str);

    }

    static void reverseString(String str){

        // using string builder

        StringBuilder strBuild = new StringBuilder();

        for (int i= str.length()-1; i >= 0; i--){
            strBuild.append(str.charAt(i));
        }
        System.out.println("reversed string :: " + strBuild.toString());

    }

    public static void main(String [] args){
        reverse("ramesh");
        reverseString("ramesh");
    }
}
