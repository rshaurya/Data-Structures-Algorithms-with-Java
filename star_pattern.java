// Creating basic star pattern

import java.util.Scanner;

public class star_pattern {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("How many lines do you want to print?");
            int lines = sc.nextInt();

            for (int i = 1; i <= lines; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");                
                }
                System.out.println();
                
            }
        }


    }
    
}
