// Program to find factorial of a number.

import java.util.Scanner;

public class factorial {

    public static int fact(int n) {

        int f = 1;

        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        return f;
        
    }
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            System.out.println("Factorial of " + n + " is: " + fact(n));
        }




    }
    
}
