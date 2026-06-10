class Solution {
    public int minElement(int[] nums) {
        int[] sums = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            int n = nums[i];
            int sum = 0;
            while(n != 0) {
                sum += (n % 10);
                n /= 10;
            }

            sums[i] = sum;
        }

        int min = sums[0];
        for(int x : sums) {
            min = Math.min(min, x);
        }

        return min;
    }
}