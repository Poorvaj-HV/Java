import java.lang.Math;

public class P3 {
    public static int buyAndSellStocks(int prices[]) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++) {
            int profit;
            if(buyPrice < prices[i]) {
                profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSellStocks(prices));
    }
}