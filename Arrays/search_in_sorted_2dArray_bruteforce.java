package Arrays;
// Program to search a key in a row-wise and column-wise sorted 2D Array.


public class search_in_sorted_2dArray_bruteforce {

    public static void searchInSorted2dArray (int arr[][], int key) {
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (key == arr[i][j]) {
                    System.out.println("key found");
                }
            }
        }

    }
    
    public static void main(String[] args) {

        int arr[][] = {{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};


        searchInSorted2dArray(arr, 48);
   
   
    }
    
}
