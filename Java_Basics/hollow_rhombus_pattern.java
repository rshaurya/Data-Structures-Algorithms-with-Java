package Java_Basics;
// Program to print hollow rhombus pattern.

import java.util.Scanner;

public class hollow_rhombus_pattern {

    public static void hollowRhombus(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == n || i ==1 || j == n || j == 1) {
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
            int n = sc.nextInt();

            hollowRhombus(n);
        }
    }
    
}
