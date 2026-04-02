class Solution {
    public int minimumPrefixLength(int[] nums) {
        int x = nums.length - 1;
        while(x > 0 && nums[x] > nums[x-1]) {
            x--;
        }

        return x;
    }
}