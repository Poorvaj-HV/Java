class Solution {
    public int missingNumber(int[] nums) {
        int getSum = (nums.length * (nums.length + 1)) / 2;
        int arrSum = 0;

        for(int i=0; i<nums.length; i++) {
            arrSum += nums[i];
        }

        return getSum - arrSum;
    }
}