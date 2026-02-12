class Solution {
    public int[] runningSum(int[] nums) {
        int sumsArr[] = new int[nums.length];

        int i=0, sum=0;
        for(int j: nums) {
            sum += j;
            sumsArr[i] = sum;
            i++;
        }
        
        return sumsArr;
    }
}