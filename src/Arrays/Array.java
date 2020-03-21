package Arrays;


import java.util.HashMap;
import java.util.Map;

public class Array {

    static void printAllElements( int [] array){

        System.out.println(" array size " + array.length);
        try{
        for(int i=0; i <= array.length; i++){
            System.out.println( "Index :: " + i +  " value " + array[i]);
        }
        } catch (ArrayIndexOutOfBoundsException ex) {

            System.out.println("index is out of bound");
        }
    }

    // search for element and print it's index

    static int search(int [] array, int element){


        for(int i=0; i <array.length; i++){
            if(array[i] == element){
                System.out.println(array[i]);
                return i;
            }
        }

        return -1;
    }



    public static void main(String[] args) {

        // give an array of integers

       /* int[] numArray = {1,5,77,88,99,176};

        // call print array

        System.out.print("Elements in Array :: ");

        printAllElements(numArray);

        // int searchValue  = search(numArray,99);

        //System.out.println();

        //System.out.println(String.format("Index of %d", searchValue));*/

        Map<Integer, String> person = new HashMap<>(); // empty map

        String [] names = {"Ramesh","Mahesh", "xyz","Divya"}; // name array

        for(int i=0; i< names.length; i++){
            person.put(i , names[i]); // search(array) ... array.search.. map.put
        }

        System.out.println("Person + " + person);
    }

}
