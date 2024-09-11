package Arrays;
// Program to find the largest and the smallest number in an array.




public class largest_num_in_array {

    public static void largestAndSmallestNum(int numbers[]) {
        
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        
        System.out.println("Largest value is: " + largest);
        System.out.println("Smallest value is: " + smallest);
    }

    public static void main(String[] args) {
        
        int numbers[] = {2,8,6,9,7,12,25};

        largestAndSmallestNum(numbers);
    }
    
}
