// Program to print the maxinum sum of each subarray from a given array.


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
