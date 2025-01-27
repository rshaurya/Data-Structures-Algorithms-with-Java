// Find whether a number is even or odd using bit operations.

public class even_odd_bits {

    public static void EvenOdd(int n) {
        
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even number");
        } else {

            System.out.println("Odd number");
        }

    }

    public static void main(String[] args) {

        EvenOdd(5);
        
    }
    
}
