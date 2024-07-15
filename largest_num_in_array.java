// Program to find the largest number in an array.


public class largest_num_in_array {

    public static int largestNum(int numbers[]) {
        
        int temp = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > temp) {
                temp = numbers[i];
            }
        }
        
        return temp;
    }

    public static void main(String[] args) {
        
        int numbers[] = {2,8,6,9,7,12,25};

        System.out.println("Largest number is: " + largestNum(numbers));

    }
    
}
