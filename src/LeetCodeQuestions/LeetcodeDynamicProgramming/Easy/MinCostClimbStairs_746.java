package LeetCodeQuestions.LeetcodeDynamicProgramming.Easy;

// Problem num: 746 Min Cost Climbing Stairs
// Link: https://leetcode.com/problems/min-cost-climbing-stairs/

public class MinCostClimbStairs_746 {

    // TC: O(n), faster than 90%
    public int minCostClimbingStairs(int[] cost) {
        // return minCostMemo(cost, cost.length, new int[cost.length + 1]);
        return minCostTab(cost);
    }
    
    private int minCostMemo(int[] cost, int index, int[] dp) {
        if (index == 0 || index == 1) return cost[index];
        if (index < 0) return 0;
        
        if (dp[index] != 0) return dp[index];
        int value = index < cost.length ? cost[index] : 0;
        return dp[index] = value + Math.min(minCostMemo(cost, index - 1, dp),
                                                  minCostMemo(cost, index - 2, dp));
    }
    
    private int minCostTab(int[] cost) {
        int[] dp = new int[cost.length];
        
        dp[0] = cost[0];
        dp[1] = cost[1];
        
        for (int i = 2; i < cost.length; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]); 
        }
        
        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
    }
}