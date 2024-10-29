// Program to check whether 2 given strings are anagrams of each other or not.

import java.util.Arrays;
import java.util.Scanner;

public class is_anagram {

    public static void isAnagram(String str1, String str2) {
        
        // convert given strings to lower case
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) { // checking if length is the same
            
            // converting string to character array
            char[] str1CharArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();

            // sorting the array alphabetically
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            boolean result = Arrays.equals(str1CharArray, str2CharArray);
            
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }

        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }
    
    
    }   


    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            String str1;
            str1 = sc.nextLine();

            String str2;
            str2 = sc.nextLine();

            isAnagram(str1, str2);
            
        }

    }
    
}
