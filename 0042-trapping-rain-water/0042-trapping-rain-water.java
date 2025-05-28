class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(n == 0 || n == 1 || n == 2) {
            return 0;
        }

        int lMT[] = new int[n];
        int rMT[] = new int[n];

        lMT[0] = height[0];
        for(int i=1; i<n; i++) {
            lMT[i] = (lMT[i-1] < height[i]) ? height[i] : lMT[i-1];
        }

        rMT[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            rMT[i] = (rMT[i+1] < height[i]) ? height[i] : rMT[i+1];
        }

        int trapedWater = 0;
        for(int i=0; i<n; i++) {
            int currLevel = Math.min(lMT[i], rMT[i]);
            int currTrapedWater = currLevel - height[i];
            trapedWater += currTrapedWater;
        }

        return trapedWater;
    }
}