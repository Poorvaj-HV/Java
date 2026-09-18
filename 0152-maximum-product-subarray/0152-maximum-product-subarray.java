class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProdSum = nums[0];

        for(int i=0; i<n; i++) {
            int currProd = 1;
            for(int j=i; j<n; j++) {
                currProd *= nums[j];
                maxProdSum = Math.max(maxProdSum, currProd);
            }
        }

        return maxProdSum;
    }
}