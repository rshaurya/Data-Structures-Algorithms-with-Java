package Java_Basics;
// Program to input a number (1-7) and print the day of the week using switch case.

import java.util.Scanner;

public class day_of_week {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number between 1-7: ");
            int day = sc.nextInt();

            switch (day) {
                case 1:
                    System.out.println("The day is Monday!");
                    break;

                case 2:
                    System.out.println("The day is Tuesday!");
                    break;

                case 3:
                    System.out.println("The day is Wednesday!");
                    break;

                case 4:
                    System.out.println("The day is Thursday!");
                    break;

                case 5:
                    System.out.println("The day is Friday!");
                    break;

                case 6:
                    System.out.println("The day is Saturday!");
                    break;

                case 7:
                    System.out.println("The day is Sunday!");
                    break;
            
                default:
                    System.out.println("The day doesn't exist!");
                    break;
            }
        }

    }
    
}
