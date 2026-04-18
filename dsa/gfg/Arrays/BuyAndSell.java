package gfg;

public class BuyAndSell {
    public int maxProfit(int[] prices) {
        // Code here
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // buy here
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // sell here
            }
        }
        return maxProfit;
    }
}
