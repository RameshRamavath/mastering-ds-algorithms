package practice;

import java.util.Arrays;

public class ReaptingElements {


        void printRepeating(int arr[], int size)
        {
            int count[] = new int[size];
            int i;

            System.out.println("Repeated elements are : ");
            for (i = 0; i < size; i++)
            {

                System.out.println("count array : " + Arrays.toString(count));

                /* if (count[arr[i]] == 1)
                    System.out.print(arr[i] + " ");
                else*/
                    count[arr[i]]++;
            }

            // System.out.println("count array : " + Arrays.toString(count));
        }

        public static void main(String[] args)
        {
            ReaptingElements repeat = new ReaptingElements();
            int arr[] = {4, 2, 4, 5, 2, 3, 1};
            int arr_size = arr.length;
            repeat.printRepeating(arr, arr_size);
        }


}
