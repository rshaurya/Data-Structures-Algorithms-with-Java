package Arrays;
// Program to find the index of an element in the given array using binary search.


public class binary_search {

    // modified binary search function using recursion
    public static int binarySearch(int numbers[], int start, int end, int key) {

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key ) {
                return binarySearch(numbers, mid+1, end, key);
            } else {
                return binarySearch(numbers, start, mid-1, key);
            }
        
        }

        return -1;

    }

    public static void main(String[] args) {
        
        int numbers[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 14;

        System.out.println("Key is present at " + binarySearch(numbers, 0, numbers.length - 1, key) + " index.");
    }
    
}
