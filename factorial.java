// Program to find factorial of a number.

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int factorial = 1;

            for (int i = 1; i <= n; i++) {

                factorial *= i;

            }

            System.out.println("Factorial of " + n + " is: " + factorial);
        }




    }
    
}
