package Java_Basics;
// Program to make square pattern with n rows.

import java.util.Scanner;

public class sqaure_pattern {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.println("****");
                
            }
        }

    }
    
}
