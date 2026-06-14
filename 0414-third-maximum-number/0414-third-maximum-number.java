class Solution {
    public int thirdMax(int[] nums) {
        long tMax = Long.MIN_VALUE;
        long sMax = Long.MIN_VALUE;
        long max = Long.MIN_VALUE;

        for(int x : nums) {
            if(x > max) {
                tMax = sMax;
                sMax = max;
                max = x;
            } else if(x > sMax && x < max) {
                tMax = sMax;
                sMax = x;
            } else if(x > tMax && x < sMax) {
                tMax = x;
            }
        }

        return (tMax == Long.MIN_VALUE) ? (int)max : (int)tMax;
    }
}