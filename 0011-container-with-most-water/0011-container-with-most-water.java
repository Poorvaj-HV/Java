class Solution {
    public static int maxArea(int[] height) {
        int n = height.length;
        int left = 0, right = n-1;
        int maxC = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            int minT = Math.min(height[left], height[right]);
            int w = right - left;
            int currC = minT * w;

            maxC = Math.max(maxC, currC);
            
            if(height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxC;
    }
}