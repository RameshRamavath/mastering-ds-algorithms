import java.util.*;

public class CharString {

    public static void main(String[] args) {

        Set<Character> setOfChar = new LinkedHashSet<>();

        List<String> listOfString = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");

        String inputStr = sc.nextLine();

        //   String inputStr = "aabcbcdb";

        StringBuffer subStr = new StringBuffer();

        for(int i=0;i<inputStr.length();i++){

            if(setOfChar.size() <= 1){
                setOfChar.add(inputStr.charAt(i));
                subStr.append(inputStr.charAt(i));
            }else{

                //   subStr.append(inputStr.charAt(i));

                Character ch = (Character) setOfChar.toArray()[setOfChar.size()-1];

                setOfChar.remove(ch);

                if(setOfChar.contains(inputStr.charAt(i))){

                    listOfString.add(subStr.toString());
                    setOfChar.clear();
                    subStr.delete(0,subStr.length());
                }else{
                    subStr.append(inputStr.charAt(i));
                    setOfChar.add(ch);
                    setOfChar.add(inputStr.charAt(i));
                }
            }
        }

        String minString = listOfString.get(0);

        for (String str:listOfString) {

            if(str.length() < minString.length()){
                minString = str;
            }
        }
        System.out.println("Shortest String:--> " +minString);
    }}