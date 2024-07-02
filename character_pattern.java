import java.util.Scanner;

public class character_pattern {

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("How many lines of chars you want to enter?");

            int n = sc.nextInt();
            char ch = 'A';

            for (int lines = 1; lines <= n; lines++) {
                for (int chars = 1; chars <= lines; chars++) {
                    System.out.print(ch);
                    ch++;
                }
                System.out.println();
            }
        }
    }
    
}
