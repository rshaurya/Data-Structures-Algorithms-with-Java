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


public class search_in_rotated_array_leetcode {

    public static int binarySearch(int nums[], int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end-start) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                    start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;

    }


    public static int searchInArray(int nums[], int target) {
    
        // To find pivot index
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

        // If array is not rotated i.e. it is a sorted array
        if (pivot_index == 0) {
            return binarySearch(nums, 0, nums.length-1, target);
        }
        
        // If target is at pivot index
        if (nums[pivot_index] == target) {
            return pivot_index;
        }
        
        // To determine which side to search
        if (target >= nums[0] && target <= nums[pivot_index-1]) { // When target is between nums[0] and nums[pivot_index], i.e. left half
            return binarySearch(nums, 0, pivot_index-1, target);
        } else { // When target is between pivot index and nums.length i.e. right half
            return binarySearch(nums, pivot_index, nums.length-1, target);
        }


    }

    public static void main(String[] args) {
        
        int nums[] = {5,1,3};
        int target = 3;

        System.out.println(searchInArray(nums, target));

    }
    
}
