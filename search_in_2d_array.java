// Program to search an element in a 2D Array.

import java.util.Scanner;

public class search_in_2d_array {

    public static boolean search_2D(int arr[][], int key) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (key == arr[i][j]) {
                    System.out.println("Key is at cell: (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        
        System.out.println("Key not found");
        return false;
        
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
        
        int key = 5;
        search_2D(arr, key);
        
    }
    
}
