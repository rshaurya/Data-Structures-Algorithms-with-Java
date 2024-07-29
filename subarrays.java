// Given an integer array nums, find the subarray with the largest sum, and return its sum.

// Example 1:
// Input: nums = [4,-1,0,0,7]
// Output: 10
// Explanation: The subarray [4,-1,7] has the largest sum 10.

public class subarrays {

    public static int maxSubarraySum(int numbers[]) {

        // Using Kadane's Algorithm
        
        int max_sum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < numbers.length; i++) { 
            currentSum += numbers[i];
            max_sum = Math.max(max_sum, currentSum);

            if (currentSum < 0) { // if currentSum is negative, assign value as zero
                currentSum = 0;
            }

        }

            return max_sum;
    }



    public static void main(String[] args) {
        int numbers[] = {4,-1,0,0,7};

        System.out.println(maxSubarraySum(numbers));
    }
    
}
