// Program to print the maxinum sum of each subarray from a given array.


public class subarrays {

    public static int maxSubarraySum(int numbers[]) {

        // Using Kadane's Algorithm
        
        int max_sum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < numbers.length; i++) { 
            if (numbers[i] < 0) { // special case -  when all numbers in the array are negative.
                max_sum = Math.max(max_sum, numbers[i]);
            } else { 
                currentSum += numbers[i];
                if (currentSum < 0) { // if currentSum is negative, assign value as zero
                    currentSum = 0;
            }

            max_sum = Math.max(max_sum, currentSum);
            }
        }

        System.out.print("Max sum is: ");
        return max_sum;

    }

    public static void main(String[] args) {
        int numbers[] = {-2, -5};

        System.out.println(maxSubarraySum(numbers));
    }
    
}
