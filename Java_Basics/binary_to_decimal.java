package Java_Basics;
// Program to convert binary number to decimal.

import java.util.Scanner;

public class binary_to_decimal {

    public static void binToDec(int binNum) {

        int decNum = 0;
        int pow = 0;

        while (binNum > 0) {

            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;           
            
        }

        System.out.println("Decimal form is " + decNum);
        
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number in binary: ");
            int binNum = sc.nextInt();

            binToDec(binNum);
        }
        
    }
    
}
