package Arrays;
/* 
There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, 
nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length),
such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, 
return the index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
*/


public class search_in_rotated_array_bruteforce {

    public static int searchInArray(int nums[], int target) {
        
        int res = -1;
        
        // For finding pivot index
        int x = 0;
        int pivot_index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[x] < nums[i]) {
                x++;
            } else {
                pivot_index = i;
                break;
            }
        }

        // Searching all elements before pivot index
        for (int i = 0; i < pivot_index; i++) {
            if (nums[i] == target) {
                res = i;
                return res;
            }
        }
    
        // Searching all elements after pivot index
        for (int i = pivot_index; i < nums.length; i++) {
            if (nums[i] == target) {
                // return i;
                res = i;
                return res;
            }
        }

        return res;
    }
    
    public static void main(String[] args) {

        int nums[] = {4,5,6,7,0,1,2};

        System.out.println(searchInArray(nums, 1));

    }
    
}
