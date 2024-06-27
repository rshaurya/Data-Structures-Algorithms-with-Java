// Program to find whether given number is positive or negative

import java.util.*;;

public class postive_negative_num {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int a = sc.nextInt();

            if (a > 0) {
                System.out.println("This is a positive number!");
            } else {
                System.out.println("This is a negative number!");
            }
        }
    }
    
}
