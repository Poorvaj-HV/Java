class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curr = 0;
        int max = 0;

        for(int x: nums) {
            if(x == 1) {
                curr++;
                max = Math.max(max, curr);
            } else {
                curr = 0;
            }
        }

        return max;
    }
}