// Program to print subarrays.


public class subarrays {

    public static void printSubarrays(int numbers[]) {
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    int sum = 0;
                    sum = sum + numbers[k];
                    System.out.print(numbers[k] + " ");
                    System.out.print(" " + sum + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6};

        printSubarrays(numbers);
    }
    
}
