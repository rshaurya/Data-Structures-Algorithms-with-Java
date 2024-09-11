package Arrays;
// Given an integer array nums, 
// return true if any value appears at least twice in the array, 
// and return false if every element is distinct

public class contains_duplicate {

    public static boolean containsDuplicate(int nums[]) {
        
        // Brute force
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (current == nums[j]) {
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {

        int nums[] = {1,2,3,4,1};

        System.out.println(containsDuplicate(nums));
        
    }
    
}
