package Java_Basics;
// Program to print numbers till n.

import java.util.Scanner;

public class print_n_numbers {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int cnt = 1;

            while (cnt <= n) {
                System.out.println(cnt);
                cnt++;
            }
        }
        
    }
    
}
