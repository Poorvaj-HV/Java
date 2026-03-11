class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;

        for(int i=0; i<nums.length; i++) {
            int n = nums[i];
            int countN = 0;
            while(n != 0) {
                n /= 10;
                countN++;
            }
            if(countN % 2 == 0) {
                ans++;
            }
        }

        return ans;
    }
}