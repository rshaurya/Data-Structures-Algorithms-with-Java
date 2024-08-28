// Program to search a key in a row-wise and column-wise sorted 2D Array.


public class search_in_sorted_2dArray_optimised {

    public static boolean searchInSorted2dArray (int arr[][], int key) {

        int row = 0, col = arr[0].length-1; 

        while (row < arr.length && col >=0) {
            if (arr[row][col] == key) {
                System.out.println("Key found at (" + row + ", " + col + ")");
                return true;
            }

            else if (arr[row][col] > key) {
                col--;
            } else {
                row++;
            }
        }

        return false;



    }
    
    public static void main(String[] args) {

        int arr[][] = {{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};


        searchInSorted2dArray(arr, 33);
   
   
    }
    
}
