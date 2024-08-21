// Program to find the sum of primary and secondary diagonals of a n*n matrix. 
// Optimised solution


public class diagonal_sum_leetcode {


    public static int diagonalSum(int arr[][]) {
        
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            
            // Primary diagonal sum
            sum += arr[i][i];

            // Secondary diagonal sum
            sum += arr[i][arr.length-i-1];

        }

        return sum;

    }
    public static void main(String[] args) {
        
        int arr[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        System.out.println(diagonalSum(arr));

    }
    
}
