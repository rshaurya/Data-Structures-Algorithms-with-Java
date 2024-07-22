// Program to print subarrays.


public class subarrays {

    public static void maxSubarraySum(int numbers[]) {
        
        int max_sum = Integer.MIN_VALUE;
        int currentSum = 0;
        int prefix[] = new int[numbers.length];

        // Prefix array stores the sum upto i-th index of numbers array. Ex, prefix[2]
        // will store the sum of elements (of numbers array) upto the 2nd index.

        prefix[0] = numbers[0]; 
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i]; // creating every single element in the prefix array.
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                
                currentSum = i == 0 ? prefix[j] : prefix[j] - prefix[i -1]; // calculating the sum
                if (max_sum < currentSum) {
                    max_sum = currentSum;
                }
            }
        }
        System.out.println("Max sum is: " + max_sum);

    }

    public static void main(String[] args) {
        int numbers[] = {2,-4,6,-1,3};

        maxSubarraySum(numbers);
    }
    
}
