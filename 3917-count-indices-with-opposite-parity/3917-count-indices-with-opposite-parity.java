class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[n-1] = 0;

        for(int i=0; i<n; i++) {
            boolean isEven = (nums[i] % 2 == 0) ? true : false;
            if(isEven) {
                int count = 0;
                for(int j=i+1; j<n; j++) {
                    if(nums[j] % 2 != 0) {
                        count++;
                    }
                }
                ans[i] = count;
            } else {
                int count = 0;
                for(int j=i+1; j<n; j++) {
                    if(nums[j] % 2 == 0) {
                        count++;
                    }
                }
                ans[i] = count;
            }
        }

        return ans;
    }
}