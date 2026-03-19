class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2) {
            return 0;
        }

        int[] leftProfit = new int[prices.length];
        int[] rightProfit = new int[prices.length];

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for(int i=0; i<prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            leftProfit[i] = maxProfit;
        }

        int maxPrice = Integer.MIN_VALUE;
        maxProfit = Integer.MIN_VALUE;

        for(int i=prices.length-1; i>=0; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);
            maxProfit = Math.max(maxProfit, maxPrice - prices[i]);
            rightProfit[i] = maxProfit;
        }

        int max = 0;

        for(int i=0; i<prices.length; i++) {
            max = Math.max(max, leftProfit[i] + rightProfit[i]);
        }

        return max;
    }
}