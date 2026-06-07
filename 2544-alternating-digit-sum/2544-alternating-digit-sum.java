class Solution {
    public int alternateDigitSum(int n) {
        int copy = n;
        int rev = 0;
        while(n != 0) {
            int r = n % 10;
            n /= 10;
            rev = rev * 10 + r;
        }

        int ans = 0;
        boolean sign = true;
        while(rev != 0) {
            int r = rev % 10;
            if(sign) {
                ans += r;
                sign = false;
            } else {
                ans -= r;
                sign = true;
            }
            rev /= 10;
        }

        return ans;
    }
}