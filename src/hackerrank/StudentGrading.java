package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentGrading {

    /*

       if marks diff with next multiple of 5 is less than 3 -> round off to next multiple of 5
       if marks less than 38 -> no need to round of -> fail

     */

    /*

      Consider Dividend = 100 and Divisor = 6

        Therefore,
        Quotient = 100/6 = 16
        Remainder = 100%6 = 4

     */

    private static List<Integer> gradingStudents(List<Integer> grades) {

        ArrayList<Integer> result = new ArrayList<>();
        for (Integer grade : grades) {
            if (grade < 38 || (grade % 5) < 3) {
                result.add(grade);
            } else {
                Integer roundedNum = grade + (5-grade % 5);
                result.add(roundedNum);
            }
        }

        return result;

    }


    public static void main(String[] args) {


        List<Integer> grades = Arrays.asList(73,67,38,33);
        List<Integer> result = StudentGrading.gradingStudents(grades);

        System.out.println(result);


    }
}


