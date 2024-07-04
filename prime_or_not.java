// Program to identify whether given number is prime or not.

import java.util.*;;

public class prime_or_not {

    public static boolean isPrime(int n) {

        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            } 
        }

        return true;
        
    }

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();

            System.out.println(isPrime(num));
        }
    }
    
}
