// Program to print sum of first n natural numbers.

import java.util.Scanner;

public class sum_of_n_nums {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int sum = 0;
            int n = sc.nextInt();
            int i = 1;
            
            while (i <= n) {
                sum += i;
                i++;
            }
            System.out.println(sum);
        }
    }
    
}
