class Solution {
    public int findPeakElement(int[] nums) {
        int idx = 0, max = nums[0];
        for(int i=1; i<nums.length-1; i++) {
            if(nums[i] > max) {
                idx = i;
            }

            if(nums[i-1] < nums[i] && nums[i] > nums[i+1]) {
                return i;
            }
        }

        if(nums[nums.length-1] > max) {
            idx = nums.length-1;
        }

        return idx;
    }
}