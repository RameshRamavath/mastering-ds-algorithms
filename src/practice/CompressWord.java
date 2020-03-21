package practice;

public class CompressWord {

    private static String wordCompress(String word) {

        // A,B and C,D are adjacent -- for a given string like CBA return C
        // DABC -- null
        // ACBDAD  -- ACBDAD

        StringBuilder str = new StringBuilder(word);
        int index = 0;

        while (str.length() >= 2 && index < str.length()-1) {
            if ((str.charAt(index) == 'A' && str.charAt(index + 1) == 'B') || (str.charAt(index) == 'B' && str.charAt(index + 1) == 'A')) {
                str.delete(index, index + 2);
                index =0;
            } else if ((str.charAt(index) == 'C' && str.charAt(index + 1) == 'D') || (str.charAt(index) == 'D' && str.charAt(index + 1) == 'C')) {
                str.delete(index, index + 2);
                index =0;
            } else
                index++;

        }
        return (str.length() == 0) ? null : str.toString();

    }

    public static void main(String[] args) {

/*       StringBuilder str = new StringBuilder("CBA");
        System.out.println(str.charAt(1));
        System.out.println(str.delete(0, 2)); // end index is not inclusive*/
        System.out.println(wordCompress("CBA"));
        System.out.println(wordCompress("DABC"));
        System.out.println(wordCompress("ACBDAD"));




    }
}
