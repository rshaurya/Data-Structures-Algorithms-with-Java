// Program to count the number of lowercase vowels that occur in a string.

import java.util.Scanner;

public class count_vowels {

    public static int countLowercaseVowels(String str) {
     
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            String str;
            str = sc.nextLine();

            System.out.println(countLowercaseVowels(str));
        }

    }
    
}
