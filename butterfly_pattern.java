// Program to print butterfly pattern.

import java.util.Scanner;

public class butterfly_pattern {

    public static void butterflyPattern(int n) {
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            for (int j = 1; j <= (n-i)*2; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }

            for (int j = (n-i)*2; j >= 1; j--) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of rows: ");
            int rows = sc.nextInt();

            butterflyPattern(rows);
            
        } 
    }
}

    
    

    
