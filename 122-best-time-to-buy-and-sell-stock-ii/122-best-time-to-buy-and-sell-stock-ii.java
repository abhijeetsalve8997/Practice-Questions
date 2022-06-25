class Solution {
    public int maxProfit(int[] prices) {
        int currProfit = 0;
        int totalProfit = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i] < prices[i+1]) {
                currProfit = prices[i+1] - prices[i];
                totalProfit += currProfit;
            }
        }
        return totalProfit;
    }
}