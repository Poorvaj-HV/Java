class Solution {
    public int gcdOfOddEvenSums(int n) {
        int eSum = 0;
        int oSum = 0;

        for(int i=1; i<=n*2; i++) {
            if(i % 2 == 0) {
                eSum += i;
            } else {
                oSum += i;
            }
        }
        
        int gcd = 0;
        for(int i=1; i<=eSum; i++) {
            if(eSum % i == 0 && oSum % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }
}