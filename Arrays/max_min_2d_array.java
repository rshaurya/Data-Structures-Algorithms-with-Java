package Arrays;
// Program to find out maximum and minimum number from a 2D array.

import java.util.Scanner;

public class max_min_2d_array {


    public static void findMaxMin(int arr[][]) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                max = Math.max(arr[i][j], max);
                min = Math.min(arr[i][j], min);
            }
        }

        System.out.println("Largest number is: " + max);
        System.out.println("Smallest number is: " + min);

    }

    public static void main(String[] args) {

        int arr[][] = new int[3][3];

        int n = arr.length, m = arr[0].length;

        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
        }

        findMaxMin(arr);
        
    }
    
}
