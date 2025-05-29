class Solution {
    public static double myPow(double x, long n) {
        long N = n;
        if(N == 0) {
            return 1;
        }

        if(N < 0) {
            return 1 / myPow(x, -N);
        }
        double half = myPow(x, (int)(N / 2));
        if(N % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public static void main(String[] args) {
        System.out.println(myPow(2, 10));
    }
}