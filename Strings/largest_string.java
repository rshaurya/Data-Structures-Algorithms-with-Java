// Given a group of strings, sort the strings Lexicographically and print the largest string.
// A string starting with 'a' < a string starting with 'd'

public class largest_string {

    public static String printLargestString(String arr[]) {
        
        String largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (largest.compareTo(arr[i]) < 0) {
                largest = arr[i];
            }
        }

        return largest;

    }

    public static void main(String[] args) {
        
        String arr[] = {"apple", "banana", "watermelon", "mango"};

        System.out.println(printLargestString(arr));


    }
    
}
