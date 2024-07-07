// Program to print hollow rectangle pattern.

import java.util.Scanner;

public class hollow_rectangle_pattern {

    public static void hollowRectangle(int totRows, int totCols) {

        for (int i = 1; i <= totRows; i++) {
            for (int j = 1; j <= totCols; j++) {
                
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
            
        }
        
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of rows: ");
            int rows = sc.nextInt();

            System.out.println("Enter number of columns: ");
            int cols = sc.nextInt();

            hollowRectangle(rows, cols);
        }
        
    }

        
}
