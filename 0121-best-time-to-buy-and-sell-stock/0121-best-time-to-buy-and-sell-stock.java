class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProf = 0;
        int buyPrice = prices[0];

        for(int i=1; i<n; i++) {
            int currPrice = prices[i];
            if(buyPrice < currPrice) {
                int currProf = currPrice - buyPrice;
                maxProf = Math.max(maxProf, currProf);
            } else {
                buyPrice = prices[i];
            }
        }

        return maxProf;
    }
}