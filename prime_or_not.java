// Program to identify whether given number is prime or not.

import java.util.*;;

public class prime_or_not {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();

            if (num == 2) {
                System.out.println(num + " is prime.");
            }

            for (int i = 2; i <= Math.sqrt(num); i++) {

                if (num % i == 0) {
                    System.out.println(num + " is not prime.");
                    break;
                } else {
                    System.out.println(num + " is prime.");
                }
                
            }
        }
    }
    
}
