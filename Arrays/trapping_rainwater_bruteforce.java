package Arrays;
// Solving trapping rainwater problem using brute force.

public class trapping_rainwater_bruteforce {

    public static int rainwaterBrute(int height[]) {
        
        int trapped_water = 0;
        for (int i = 0; i < height.length; i++) {
            
            int left_max = height[i];
            for (int j = 0; j < i; j++) {
                left_max = Math.max(left_max, height[j]);
            }

            int right_max = height[i];
            for (int k = i+1; k < height.length; k++) {
                right_max = Math.max(right_max, height[k]);
            }

            trapped_water += Math.min(left_max, right_max) - height[i];

        }

        return trapped_water;
    }
    
    public static void main(String[] args) {

        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(rainwaterBrute(height));
        
    }   
}
