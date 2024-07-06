// Program to check if a number is even or not.

import java.util.Scanner;

public class even_odd {

    public static boolean evenOdd(int n) {

        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();

            System.out.println(evenOdd(n));
        }

    }
}
