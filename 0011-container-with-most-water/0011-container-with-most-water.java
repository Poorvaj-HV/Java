class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int currCap = 0;
        int maxCap = Integer.MIN_VALUE;

        while(left <= right) {
            int minHeight = Math.min(height[left], height[right]);
            int width = right - left;
            currCap = minHeight * width;

            maxCap = Math.max(maxCap, currCap);
            
            if(height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxCap;
    }
}