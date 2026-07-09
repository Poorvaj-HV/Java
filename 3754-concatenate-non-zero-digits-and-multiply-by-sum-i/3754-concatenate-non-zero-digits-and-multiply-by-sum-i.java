class Solution {
    public long sumAndMultiply(int n) {
        int x = 0;
        int sum = 0;

        while(n != 0) {
            int r = n % 10;

            if(r != 0) {
                x = x * 10 + r;
                sum += r;
            }

            n /= 10;
        }

        x = reverse(x);

        return (long) sum * x;
    }

    public int reverse(int x) {
        int y = 0;
        
        while(x != 0) {
            int r = x % 10;
            y = y * 10 + r;
            x /= 10;
        }

        return y;
    }
}