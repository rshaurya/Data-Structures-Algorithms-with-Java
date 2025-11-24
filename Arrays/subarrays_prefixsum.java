package Arrays;

public class subarrays_prefixsum {
    
    public static int maxSubarraySum(int numbers[]) {

        int max_sum = Integer.MIN_VALUE;

        // calculating prefix sum
        int prefixsum[] = new int[numbers.length];
        prefixsum[0] = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            prefixsum[i] = prefixsum[i - 1] + numbers[i];
        }

        // calculating maximum subarray sum using prefix sum
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                // to calculate sum: prefixsum[end] - prefixsum[start-1]
                // if start is 0, then just take prefixsum[end]
                int subarray_sum = i == 0 ? prefixsum[j] : prefixsum[j] - prefixsum[i - 1];
                max_sum = Math.max(max_sum, subarray_sum);
            }
        }

        return max_sum;
    }

    public static void main(String[] args) {
        int numbers[] = {4, -1, 0, 5, 7};
        System.out.println(maxSubarraySum(numbers));
    }

}
