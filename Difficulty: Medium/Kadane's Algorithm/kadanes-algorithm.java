class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int maxSum = 0;
        int resultSum = arr[0];
        
        for(int i: arr) {
            maxSum = Math.max(maxSum + i, i);
            resultSum = Math.max(maxSum, resultSum);
        }
        
        return resultSum;
    }
}
