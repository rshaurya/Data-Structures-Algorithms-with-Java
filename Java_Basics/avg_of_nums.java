package Java_Basics;
// Input three numbers and find the average.

import java.util.*;;

public class avg_of_nums {

    public static int avgOfNums(int num1, int num2, int num3) {
        
        int avg =  (num1 + num2 + num3) / 3;

        return avg;
        
    }
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            
            System.out.println("Average is: " + avgOfNums(n1, n2, n3));
        }

    }
    
}
