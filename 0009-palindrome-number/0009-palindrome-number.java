class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }

        int copy = x;
        int result = 0;
        while(x != 0) {
            int r = x % 10;
            x = x / 10;
            result = result * 10 + r;
        }

        return result == copy;
    }
}