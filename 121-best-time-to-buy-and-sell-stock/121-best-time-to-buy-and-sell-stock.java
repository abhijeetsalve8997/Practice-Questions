class Solution {
    public int maxProfit(int[] prices) {
        
        // APPROACH 01: BRUTFORCE APPROACH (NESTED LOOPS)
        
        // APPROACH 02: T.C O(N) S.C O(1)
        // int maxProfit = 0;
        // int currProfit = 0;
        // int minPrice = prices[0];
        // for (int i = 1; i < prices.length; i++) {
        //     if (prices[i] < minPrice) {
        //         minPrice = prices[i];
        //     }
        //     else {
        //         currProfit = prices[i] - minPrice;
        //         if (maxProfit < currProfit) {
        //             maxProfit = currProfit;
        //         }
        //     }
        // }
        // return maxProfit;
        
        // APPROACH 03: 
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            }
            else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}