public class trading_Naive {
    public int maxProfit(int prices[]) {
        int maxprofit = 0;
        for (int buyDate = 0; buyDate < prices.length - 1; buyDate++) {
            for (int sellDate = buyDate; sellDate < prices.length; sellDate++) {
                int profit = prices[sellDate] - prices[buyDate];
                if (profit > maxprofit)
                    maxprofit = profit;
            }
        }
        return maxprofit;
    }
}
