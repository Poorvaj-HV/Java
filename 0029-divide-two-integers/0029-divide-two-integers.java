class Solution {
    public int divide(int dividend, int divisor) {
        // Handle the overflow edge case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        return dividend / divisor;
    }
}