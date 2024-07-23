// Program to print the maxinum sum of each subarray from a given array.


public class subarrays {

    public static void maxSubarraySum(int numbers[]) {

        // Using Kadane's Algorithm
        
        int max_sum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currentSum += numbers[i];
            if (currentSum < 0) {
                currentSum = 0; // if currentSum is negative, assign value as zero
            }

            max_sum = Math.max(max_sum, currentSum);    
        }
        
        System.out.println("Max sum is: " + max_sum);

    }

    public static void main(String[] args) {
        int numbers[] = {-2, -5, 8, 9};

        maxSubarraySum(numbers);
    }
    
}
