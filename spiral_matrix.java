/* Program to print all elements of a 2D array in a spiral fashion.

For example, consider the array:

1  2  3  4
5  6  7  8
9  10 11 12
13 14 15 16

The output should be:

1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10

*/ 


public class spiral_matrix {

    public static void printSpiral(int arr[][]) {

        int startRow = 0, endRow = arr.length - 1;
        int startCol = 0, endCol = arr[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            
            // Printing top row
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }

            // Printing right column
            for (int i = startRow+1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }

            // Printing bottom row
            for (int j = endCol-1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(arr[endRow][j] + " ");
            }

            // Printing left column
            for (int i = endRow-1; i >= startRow+1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(arr[i][startCol] + " ");
            }

            startRow++; endRow--;
            startCol++; endCol--;
        
        }

        System.out.println();    
        
    }
    
    
    public static void main(String[] args) {

        int arr[][] = {{1,2,3},
                        {5,6,7},
                        {9,10,11},
                        {13,14,15}};

        printSpiral(arr);
        
    }

    
}
