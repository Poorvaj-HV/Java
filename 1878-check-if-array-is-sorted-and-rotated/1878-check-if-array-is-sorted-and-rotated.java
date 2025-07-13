class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        boolean pE = false;
        boolean isSaR = false;

        for(int i=0; i<n-1; i++) {
            if(nums[i] > nums[i+1]) {
                pE = true;
                reverse(nums, 0, i);
                reverse(nums, i+1, n-1);
                reverse(nums, 0, n-1);
                isSaR = sorted(nums, 0, n);
            }
        }

        if(isSaR || !pE) {
            return true;
        } else {
            return false;
        }
    }

    public void reverse(int[] nums, int si, int ei) {
        int n = nums.length;
        while(si < ei) {
            int temp = nums[si];
            nums[si] = nums[ei];
            nums[ei] = temp;
            si++;
            ei--;
        }
    }

    public boolean sorted(int[] nums, int si, int ei) {
        for(int i=si; i<ei-1; i++) {
            if(nums[i] > nums[i+1]) {
                return false;
            }
        }
        return true;
    }
}