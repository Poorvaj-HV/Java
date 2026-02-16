class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int result = nums[0];

        for(int i=1; i<n; i++) {
            result ^= nums[i];
        }

        return result;
    }
}