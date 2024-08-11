// Program to implement Counting Sort.

/*
 * How it works:
 * 
 * Create an array which stores the frequency of each unique element from original array.
 * Traverse the count array and reconstruct the original array's elements.
 */

public class counting_sort {

    public static void countingSort(int arr[]) {

        // Find the largest element in the array
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Create a count array to store the frequency/count of each unique element
        int count[] = new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Reconstruct the sorted array using count array
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {1,4,1,3,2,4,3,7};

        countingSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    
}
