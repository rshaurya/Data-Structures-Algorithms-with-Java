package Arrays;
// Given n non-negative integers representing an elevation map where 
// the width of each bar is 1, compute how much water it can trap after raining.

// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section), 
// is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
// In this case, 6 units of rain water (blue section) are being trapped.



public class trapping_rainwater {

    public static int trappingRainwater(int height[]) {
        
        // Array of maximum left boundary
        int left_max[] = new int[height.length];
        left_max[0] = height[0];
        
        for (int i = 1; i < left_max.length; i++) {
            left_max[i] = Math.max(height[i], left_max[i-1]);
        }

        // Array of maximum right boundary        
        int right_max[] = new int[height.length];
        right_max[height.length - 1] = height[height.length - 1];
        
        for (int i = height.length - 2; i >= 0; i--) {
            right_max[i] = Math.max(height[i], right_max[i+1]);
        }

        // Calculating trapped rainwater
        int trapped_water = 0;
        for (int i = 0; i < height.length; i++) {
            int water_level = Math.min(right_max[i], left_max[i]);
            trapped_water += water_level - height[i];
        }

        return trapped_water;
        
    }
    public static void main(String[] args) {

        int height[] = {4,2,0,6,3,2,5};

        System.out.println(trappingRainwater(height));
        
    }
    
}
