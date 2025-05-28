class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int count = 0;

        int left = 0, right = 1, idx;
        while(right < n) {
            if(nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right];
                count++;
            }
            right++;
        }

        return count+1;
    }
}