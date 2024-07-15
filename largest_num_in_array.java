// Program to find the largest number in an array.

import java.util.*;


public class largest_num_in_array {

    public static int largestNum(int numbers[]) {
        
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        
        return largest;
    }

    public static void main(String[] args) {
        
        int numbers[] = {2,8,6,9,7,12,25};

        System.out.println("Largest number is: " + largestNum(numbers));

    }
    
}
