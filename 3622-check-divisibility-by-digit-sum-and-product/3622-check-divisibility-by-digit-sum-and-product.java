class Solution {
    public boolean checkDivisibility(int n) {
        int copy = n;
        int sum = 0;
        int prod = 1;

        while(n != 0) {
            int r = n % 10;
            n = n / 10;
            sum += r;
            prod *= r;
        }

        return (copy % (sum + prod) == 0);
    }
}