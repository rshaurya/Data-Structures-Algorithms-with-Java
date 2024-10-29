import java.util.Scanner;

// Check if given string is a palindrome or not

public class palidrome_string {

    public static Boolean isPalindrome(String str) {
        
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-i-1)) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            String str;
            str = sc.nextLine();

            System.out.println(isPalindrome(str));
        }

    }
    
}
