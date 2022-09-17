package LeetCodeQuestions.LeetcodeDynamicProgramming.Medium;

// Problem num: 2400 Number of Ways to Reach a Position After Exactly k Steps
// Link: https://leetcode.com/problems/number-of-ways-to-reach-a-position-after-exactly-k-steps/

import java.util.Arrays;

public class NumWaysToReachAtKStep_2400 {

    // TC: O(n), Faster than 60%
    public int numberOfWays(int start, int end, int k) {
        int negPossible = start - k < 0 ? Math.abs(start - k) : 0;
        int[][] dp = new int[Math.max(start, end) + negPossible + k + 1][k + 1];
        
        for (int[] row : dp) Arrays.fill(row, -1);
        return numWaysMemo(start + negPossible, end + negPossible, k, dp);
    }

    
    private int numWaysMemo(int start, int end, int k, int dp[][]) {
        if (k == 0) {
            if (start == end) return 1;
            else return 0;
        } else if (k < 0) return 0;
        
        if (dp[start][k] != -1) return dp[start][k];
        
        
        int right = numWaysMemo(start + 1, end, k - 1, dp) % 1000000007;
        int left = numWaysMemo(start - 1, end, k - 1, dp) % 1000000007;
        return dp[start][k] = 
            (right + left) % 1000000007;
    }
}