class Solution {
    public int missingNumber(int[] nums) {
        int getSum = 0;
        int arrSum = 0;

        for(int i=0; i<nums.length; i++) {
            getSum += i;
            arrSum += nums[i];
        }

        getSum += nums.length;

        return getSum - arrSum;
    }
}