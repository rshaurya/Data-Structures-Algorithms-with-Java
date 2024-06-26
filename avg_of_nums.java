// Input three numbers and find the average.

import java.util.*;;

public class avg_of_nums {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            
            int avg =  (num1 + num2 + num3) / 3;

            System.out.println("Average is: " + avg);
        }

    }
    
}
