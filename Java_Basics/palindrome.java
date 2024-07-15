package Java_Basics;
// Program to check if a given number is a palindrome.

import java.util.Scanner;

public class palindrome {

    public static boolean isPalindrome(int  n) {

        int reverse = 0;
        int tmp = n;

        while (n > 0) {

            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;

            n /= 10;
           
        }

        if (tmp == reverse) {
            return true;
        } else {
            return false;
        }
        
    }

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");

            int n = sc.nextInt();
            System.out.println(isPalindrome(n));
        }

    }
    
}
