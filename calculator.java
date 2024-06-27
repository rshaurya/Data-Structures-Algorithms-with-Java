// Program to create simple calculator

import java.util.*;;

public class calculator {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter second number: ");
            int num2 = sc.nextInt();
            System.out.println("Enter operator: ");
            char opt = sc.next().charAt(0);

            switch (opt) {
                case '+':
                    System.out.println(num1 + num2);
                    break;
                    
                case '-':
                    System.out.println(num1 - num2);
                    break;
                    
                case '*':
                    System.out.println(num1 * num2);
                    break;
                    
                case '/':
                    System.out.println(num1/num2);
                    break;
                    
                case '%':
                    System.out.println(num1 % num2);
                    break; 
                           
                default:
                    System.out.println("Please enter a valid operation.");
                    break;
            }
        }

    }
    
}
