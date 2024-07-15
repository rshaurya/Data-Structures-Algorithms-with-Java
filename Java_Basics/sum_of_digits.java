package Java_Basics;
// Program to compute sum of digits of a number.

import java.util.Scanner;

public class sum_of_digits {

    public static int sumOfDigits(int n) {

        int sum = 0;

        while (n > 0) {
            
            int lastDigit = n % 10;
            sum += lastDigit;

            n /= 10;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();

            System.out.println("Sum of digts are: " + sumOfDigits(n));
        }
    }
    
}
