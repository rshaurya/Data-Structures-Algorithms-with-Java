// To check if a number is a binary palindrome, we can convert the number to its binary representation 
// and then check if that representation reads the same forwards and backwards. 

public class binary_palindrome {
    
    public static boolean isBinaryPalindrome(int n){
        int reversed = 0;
        int original = n;

        while(n > 0){
            reversed = (reversed << 1) | (n & 1);
            n >>= 1;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        int number = 9; // Binary representation is 1001, which is a palindrome
        if(isBinaryPalindrome(number)){
            System.out.println(number + " is a binary palindrome.");
        } else {
            System.out.println(number + " is not a binary palindrome.");
        }
    }
    
}
