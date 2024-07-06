// Program to convert decimal number to binary.

import java.util.Scanner;

public class decimal_to_binary {

    public static void decToBin(int decNum) {

        int binNum = 0;
        int pow = 0;

        while (decNum > 0) {

            int remainder = decNum % 2;

            binNum = binNum + (remainder * (int)Math.pow(10, pow));
            pow++;
            decNum /= 2;
        }

        System.out.println("The number in binary form is: " + binNum);
                
    }

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number in decimal form: ");
            int n = sc.nextInt();

            decToBin(n);
        }
    }
    
}
