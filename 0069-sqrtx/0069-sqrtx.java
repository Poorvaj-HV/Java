class Solution {
    public int mySqrt(int x) {
        double val = Math.pow(x, 0.5);
        return (int)Math.floor(val);
    }
}