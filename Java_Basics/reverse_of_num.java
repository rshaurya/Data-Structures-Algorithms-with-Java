package Java_Basics;
// Program to print reverse of number.

import java.util.Scanner;

public class reverse_of_num {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");

            int num = sc.nextInt();
            int rev_num = 0;

            while (num > 0) {
                rev_num = (rev_num * 10) + (num % 10);
                num /= 10;
            }
            
            System.out.println(rev_num);
        }
        
    }
    
}
