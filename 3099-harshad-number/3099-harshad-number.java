class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int copy = x;
        int sum = 0;
        
        while(x != 0) {
            int r = x % 10;
            sum += r;
            x /= 10;
        }

        return (copy % sum == 0) ? sum : -1;
    }
}