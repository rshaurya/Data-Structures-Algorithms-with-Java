// Java program to swap two nibbles in a byte

public class swap_two_nibbles_in_byte {

    public static int swapNibbles(int x) {
        // A nibble is 4 bits, so we can use bitwise operations to swap them
        return ((x & 0x0F) << 4) | ((x & 0xF0) >> 4);
    }

    public static void main(String[] args) {
        int x = 100; // 01100100 in binary
        System.out.println("Original byte: " + x);
        int swapped = swapNibbles(x);
        System.out.println("Byte after swapping nibbles: " + swapped);
    }
    
}
