class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int maxContainer = 0;
        for(int i=1; i<=n*n; i++) {
            if(maxWeight-w >= 0) {
                maxWeight -= w;
                maxContainer++;
            }
        }

        return maxContainer;
    }
}