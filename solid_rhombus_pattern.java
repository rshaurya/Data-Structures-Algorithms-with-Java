// Program to print sold rhombus pattern.

import java.util.Scanner;

public class solid_rhombus_pattern {

    public static void solidRhombus(int rows, int stars) {
        
        for (int i = 1; i <= rows; i++) {

            for (int j = 0; j <= rows-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");   
            }
            System.out.println();
            
        }
    }
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of rows: ");
            int rows = sc.nextInt();

            System.out.println("Enter the number of stars: ");
            int stars = sc.nextInt();

            solidRhombus(rows, stars);
        }

    }
}
