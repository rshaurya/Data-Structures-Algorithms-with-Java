// Program to print multiplication table of a number n.

import java.util.Scanner;

public class multiplication_table {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i = 1; i <= 10; i++) {

                System.out.println(n * i);
                
            }
        }
    }
    
}
