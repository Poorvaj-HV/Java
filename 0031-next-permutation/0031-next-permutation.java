class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;

        for(int i=n-2; i>=0; i--) {
            if(nums[i] < nums[i+1]) {
                pivot = i;
                break;
            }
        }

        if(pivot == -1) {
            reverseArr(nums, 0, n-1);
            return;
        }

        int diff = Integer.MAX_VALUE;
        int idx = -1;
        for(int i=n-1; i>pivot; i--) {
            if(nums[pivot] < nums[i] && Math.abs(nums[pivot] - nums[i]) < diff) {
                diff = Math.abs(nums[pivot] - nums[i]);
                idx = i;
            }
        }

        int temp = nums[pivot];
        nums[pivot] = nums[idx];
        nums[idx] = temp;

        reverseArr(nums, pivot+1, n-1);
    }

    public void reverseArr(int[] nums, int si, int ei) {
        while(si < ei) {
            int temp = nums[si];
            nums[si] = nums[ei];
            nums[ei] = temp;
            si++;
            ei--;
        }
    }
}