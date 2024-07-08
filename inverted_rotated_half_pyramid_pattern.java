// Program to create inverted & rotated half pyramid pattern.


import java.util.Scanner;

public class inverted_rotated_half_pyramid_pattern {

    public static void pyramidPattern(int totRows) {
        
        for (int i = 1; i <= totRows; i++) {

            // spaces
            for (int j = 1; j <= totRows-i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
            
        }
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of rows: ");
            int n = sc.nextInt();

            pyramidPattern(n);
        }
        
    }
    
}
