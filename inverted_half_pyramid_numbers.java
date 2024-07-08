// Program to print inverted half pyramid pattern with numbers.

/*
 * 1234
 * 123
 * 12
 * 1
 */

import java.util.Scanner;

public class inverted_half_pyramid_numbers {


    public static void numberPyramidPattern(int totRows) {
        
        for (int i = 1; i <= totRows; i++) {

            for (int j = 1; j <= totRows-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of rows: ");
            int n = sc.nextInt();

            numberPyramidPattern(n);
        }
    }
    
}
