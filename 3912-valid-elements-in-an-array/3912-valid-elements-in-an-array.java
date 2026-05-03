class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        ans.add(nums[0]);
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = nums[0];
        rightMax[n-1] = nums[n-1];

        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], nums[i]);
        }

        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], nums[i]);
        }

        for(int i=1; i<n-1; i++) {
            if(leftMax[i-1] < nums[i] || nums[i] > rightMax[i+1]) {
                ans.add(nums[i]);
            }
        }

        if(nums.length > 1) {
            ans.add(nums[nums.length-1]);
        }

        return ans;
    }
}