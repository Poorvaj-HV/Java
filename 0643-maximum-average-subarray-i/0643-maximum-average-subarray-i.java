class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long[] preSum = new long[nums.length];
        preSum[0] = nums[0];

        for(int i=1; i<nums.length; i++) {
            preSum[i] = preSum[i-1] + nums[i];
        }

        long maxSum = preSum[k-1];
        int l = 1;
        int r = k;

        while(r < nums.length) {
            long currSum = preSum[r] - preSum[l-1];
            maxSum = Math.max(currSum, maxSum);
            l++;
            r++;
        }

        return (double) maxSum / k;
    }
}