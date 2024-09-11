package Arrays;
// Program to find the index of an element in the given array using linear search.


public class linear_search {

    public static int linearSearch(int numbers[], int key) {
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }

        return -1; //key doesn't exist
    }


    public static void main(String[] args) {
        
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 28;

        int index = linearSearch(numbers, key);
        if (index == -1) {

            System.out.println("Key does not exist");
        } else {
            System.out.println("Key is at " + index + " index.");
        }

    }
    
}
