package Java_Basics;
// Program to find whether a year is a leap year or not

import java.util.Scanner;

public class leap_year {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a year: ");
            int year = sc.nextInt();

            if (year % 4 == 0 || (year % 100 != 0 && year % 400 == 0)) {
                System.out.println("This year is a leap year!");
            } else {
                System.out.println("This year is not a leap year.");
            }
        }


    }
    
}
