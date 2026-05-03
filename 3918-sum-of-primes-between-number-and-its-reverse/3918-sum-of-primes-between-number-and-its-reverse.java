class Solution {
    public int sumOfPrimesInRange(int n) {
        int rev = 0;
        int copy = n;
        while(copy != 0) {
            int r = copy % 10;
            copy = copy / 10;
            rev = 10 * rev + r;
        }

        int sum = 0;
        int st = Math.min(n, rev);
        int ed = Math.max(n, rev);
        for(int i=st; i<=ed; i++) {
            if(isPrime(i)) {
                sum += i;
            }
        }

        return sum;
    }

    public boolean isPrime(int p) {
        int count = 0;
        for(int i=1; i<=p; i++) {
            if(p % i == 0) {
                count++;
            }
        }

        return count == 2;
    }
}