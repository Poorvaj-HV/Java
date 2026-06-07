class Solution {
    public boolean isFascinating(int n) {
        int[] frequency = new int[10];

        int x = n;
        while(n != 0) {
            int r = n % 10;
            frequency[r]++;
            n /= 10;
        }

        n = x * 2;
        while(n != 0) {
            int r = n % 10;
            frequency[r]++;
            n /= 10;
        }

        n = x * 3;
        while(n != 0) {
            int r = n % 10;
            frequency[r]++;
            n /= 10;
        }

        for(int i=1; i<frequency.length; i++) {
            if(frequency[i] != 1) {
                return false;
            }
        }

        return true;
    }
}