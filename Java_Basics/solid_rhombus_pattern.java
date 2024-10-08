package Java_Basics;
// Program to print sold rhombus pattern.

import java.util.Scanner;

public class solid_rhombus_pattern {

    public static void solidRhombus(int n) {
        
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");   
            }
            System.out.println();
            
        }
    }
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the number of rows: ");
            int n = sc.nextInt();

            solidRhombus(n);
        }

    }
}
