// Using built in sort functions

import java.util.Arrays;
import java.util.Collections;

public class inbuilt_sort {

    public static void main(String[] args) {
        
        // Created Integer object as reverseOrder function uses objects as arguments.
        Integer arr[] = {5,4,1,3,2};
        
        int ar[] = {5,4,1,3,2}; // normal primitive, int type array
    
        Arrays.sort(ar, 0, 3); // ascending order

        Arrays.sort(arr, Collections.reverseOrder()); // descending order


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    
}
