package Java_Basics;
// Program that reads a set of integers from the user and prints sum of even & odd numbers.

import java.util.Scanner;

public class even_odd_sum {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            int even_sum = 0;
            int odd_sum = 0;
            int choice; 
            
            do {
                int num = sc.nextInt();

                if (num % 2 == 0) {
                    even_sum += num;
                } else {
                    odd_sum += num;
                }
                System.out.println("Do you want to continue? Press 1 for yes, 2 for no.");

                choice = sc.nextInt();

            } while (choice == 1);

            System.out.println("Sum of even numbers is: " + even_sum);
            System.out.println("Sum of odd numbers is: " + odd_sum);
                  

        }




    }
    
}
