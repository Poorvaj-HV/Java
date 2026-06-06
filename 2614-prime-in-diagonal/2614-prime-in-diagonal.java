class Solution {
    public int isPrime(int p) {
        if(p == 2) {
            return p;
        }

        if(p % 2 == 0 || p == 1 || p == 0) {
            return 0;
        }

        for(int i=3; i*i<=p; i+=2) {
            if(p % i == 0) {
                return 0;
            }
        }

        return p;
    }

    public int diagonalPrime(int[][] nums) {
        int largePrime = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++) {
            int num = Math.max(isPrime(nums[i][i]), isPrime(nums[i][nums.length-1-i]));
            largePrime = Math.max(num, largePrime);
        }

        return largePrime;
    }
}