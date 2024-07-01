// Program to keep printing numbers until user enters a multiple of ten.

import java.util.Scanner;

public class multiple_of_ten {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            do {
                int num = sc.nextInt();
                if (num % 10 == 0) {
                    System.out.println("Exiting the loop!");
                    break;
                }
                System.out.println(num);

            } while (true);
        }
    }
    
}
