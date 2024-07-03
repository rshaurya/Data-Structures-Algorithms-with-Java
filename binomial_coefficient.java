// Program to calculate binomial coefficient.

import java.util.Scanner;

public class binomial_coefficient {

    public static int fact(int n) {

        int f = 1;

        for (int i = 1; i <= n; i++) {
            f *= i;
        }

        return f;
    }

    public static int binomialCoefficient(int n, int r) {

        int bin_coeff = fact(n) / (fact(r) * fact(n-r));

        return bin_coeff;
        
    }

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a value for n: ");
            int n = sc.nextInt();
            System.out.println("Enter a value for r: ");
            int r = sc.nextInt();

            System.out.println("Binomial Coefficient is: " + binomialCoefficient(n, r));
        }
    }
    
}
