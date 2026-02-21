class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSA = 0;
        int resultSA = nums[0];

        for(int i: nums) {
            maxSA = Math.max(maxSA+i, i);
            resultSA = Math.max(maxSA, resultSA);
        }

        return resultSA;
    }
}