class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        pre[0] = nums[0];
        int[] suf = new int[n];
        suf[n-1] = nums[n-1];

        for(int i=1; i<n; i++) {
            pre[i] = Math.min(pre[i-1], nums[i]);
        }

        for(int i=n-2; i>=0; i--) {
            suf[i] = Math.max(suf[i+1], nums[i]);
        }

        for(int i=1; i<n-1; i++) {
            if(pre[i-1] < nums[i] && nums[i] < suf[i+1]) {
                return true;
            }
        }

        return false;
    }
}