class Solution {
    public int maxProduct(int[] nums) {
        int fMax = Integer.MIN_VALUE, sMax = 1;
        
        for(int x: nums) {
            if(x > fMax) {
                sMax = fMax;
                fMax = x;
            } else if(x > sMax && x <= fMax) {
                sMax = x;
            }
        }

        return (fMax-1) * (sMax-1);
    }
}