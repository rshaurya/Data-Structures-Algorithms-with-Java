package Java_Basics;
// Program to print inverted star pattern.

// stars = n - i + 1

import java.util.Scanner;

public class inverted_star_pattern {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of lines: ");
            int lines = sc.nextInt();

            for (int line = 1; line <= lines; line++) {
                for (int star = 1; star <= lines-line+1; star++) {
                    System.out.print("*");
                }
                System.out.println();
                
            }
        }

    }
    
}
