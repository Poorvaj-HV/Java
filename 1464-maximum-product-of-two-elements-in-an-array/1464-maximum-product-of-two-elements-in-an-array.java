class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 2) {
            return (nums[0]-1) * (nums[1]-1);
        }

        int fMax = Integer.MIN_VALUE, sMax = 1;
        
        for(int x: nums) {
            if(x > fMax) {
                sMax = fMax;
                fMax = x;
            } else if(x > sMax && x <= fMax) {
                sMax = x;
            }
        }

        return (fMax-1) * (sMax-1);
    }
}