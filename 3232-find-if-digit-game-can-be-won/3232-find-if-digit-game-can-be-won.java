class Solution {
    public boolean canAliceWin(int[] nums) {
        int sglSum = 0, dblSum = 0;
        for(int i=0; i<nums.length; i++) {
            int x = nums[i];
            if((x /= 10) == 0) {
                sglSum += nums[i];
            } else {
                dblSum += nums[i];
            }
        }

        return sglSum > dblSum || sglSum < dblSum;
    }
}