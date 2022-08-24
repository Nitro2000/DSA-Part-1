package LeetCodeQuestions.LeetcodeDynamicProgramming.Easy;

// Problem num: 121 Best Time to Buy and Sell Stock
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class BestTimeToBuySell_121 {

    // TC: O(n), faster than 32%;
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        
        int[] dp = new int[prices.length];
        dp[0] = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) buy = prices[i];

            if (prices[i] - buy > dp[i - 1])
                dp[i] = prices[i] - buy;
            else dp[i] = dp[i - 1];
        }
        
        return dp[prices.length - 1];
    }
    
    
}