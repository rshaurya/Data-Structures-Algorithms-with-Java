// Program to print triangle pattern with zeros and ones.

/*
 * 1
 * 01
 * 101
 * 0101
 */

public class binary_triangle_pattern {

    public static void binaryTriangle(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                if ((i+j) % 2 == 0) {
                    System.out.print(1+" ");
                } else {
                    System.out.print(0+" ");
                }
                               
            }
            System.out.println();
            
        }
        
    }

    public static void main(String[] args) {
        
        binaryTriangle(4);
    }
    
}
