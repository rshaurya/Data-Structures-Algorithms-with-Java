// Program to print subarrays.


public class subarrays {

    public static void printSubarrays(int numbers[]) {
        
        int max_sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += numbers[k];
                    if (sum > max_sum) {
                        max_sum = sum;
                    } 
                    System.out.print(numbers[k] + " ");
                }
                System.out.print("Sum of the subarray is: " + sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max sum is: " + max_sum);
        System.out.println("Min sum is: " + numbers[0]);

    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6};

        printSubarrays(numbers);
    }
    
}
