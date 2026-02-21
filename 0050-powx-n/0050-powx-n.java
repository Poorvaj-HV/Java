class Solution {
    public static double myPow(double x, long n) {
        // long N = n;
        // if(N == 0) {
        //     return 1;
        // }

        // if(N < 0) {
        //     return 1 / myPow(x, -N);
        // }
        // double half = myPow(x, (int)(N / 2));
        // if(N % 2 == 0) {
        //     return half * half;
        // } else {
        //     return half * half * x;
        // }
        if(n == 0) {
            return 1;
        }

        if(n < 0) {
            return 1 / myPow(x, -n);
        } 
        
        double half = myPow(x, n/2);
        if(n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}