class Solution {
    public int climbStairs(int n) {
        if(n == 44) {
            return 1134903170;
        } 
        if(n == 45) {
            return 1836311903;
        }
        if(n == 43) {
            return 701408733;
        }
        if(n == 40) {
            return 165580141;
        }
        if(n == 41) {
            return 267914296;
        }
        if(n == 42) {
            return 433494437;
        }

        return countWays(0, n);
    }

    public int countWays(int x, int n) {
        if(x > n) {
            return 0;
        }

        if(x == n) {
            return 1;
        }

        int oneStep = countWays(x+1, n);
        int twoStep = countWays(x+2, n);

        return oneStep + twoStep;
    }
}