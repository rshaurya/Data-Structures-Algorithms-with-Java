// Program to print all prime numbers upto n.

import java.util.Scanner;

public class primes_in_range {

    public static void primesInRange(int n) {

        for (int i = 2; i <= n; i++) {
            if (prime_or_not.isPrime(i)) {
                System.out.print(i + " ");            
            }
        }
        System.out.println();

    }
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the end range: ");
            int range = sc.nextInt();

            primesInRange(range);
        }
    }
    
}
