package LeetCodeQuestions.LeetcodeDynamicProgramming.Easy;

// Problem num: 70 Climbing Stairs
// Link: https://leetcode.com/problems/climbing-stairs/

public class ClimbingStairs_70 {

    // TC: O(n), faster than 100%, n because due to dp each call only take place one time
    public int climbStairs(int n) {
        return climbStairsMemo(n, new int[n + 1]);
        // return climbStairsTab(n);
    }
    
    private int climbStairsMemo(int n, int[] dp) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        
        if (dp[n] != 0) return dp[n];
        
        return dp[n] = climbStairsMemo(n - 1, dp) + climbStairsMemo(n - 2, dp);
    }
    
    private int climbStairsTab(int n) {
        
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        return dp[n];
    }
}