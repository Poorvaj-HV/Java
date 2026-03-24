class Solution {
    public int[] sortArrayByParity(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            if(nums[i] % 2 == 0) {
                nums[i] = -nums[i];
            }
        }

        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++) {
            if(nums[i] % 2 == 0) {
                nums[i] = -nums[i];
            }
        }

        return nums;
    }
}