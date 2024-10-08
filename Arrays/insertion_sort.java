package Arrays;
// Program to implement Insertion Sort.

public class insertion_sort {

    public static void insertionSort(int arr[]) {
        
        for (int i = 1; i < arr.length; i++) {

            int curr = arr[i]; //storing value of current element
            int prev = i-1; //previous index

            //finding correct position to insert element
            while (prev >= 0 && arr[prev] > curr) { //for ascending order
                arr[prev+1] = arr[prev];
                prev--;
            }

            arr[prev+1] = curr; //insertion

        }
    }


    public static void main(String[] args) {
        
        int arr[] = {5,4,1,3,2};

        insertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
