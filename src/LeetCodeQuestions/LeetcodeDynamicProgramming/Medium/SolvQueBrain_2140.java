package LeetCodeQuestions.LeetcodeDynamicProgramming.Medium;

// Problem num: 2140 Solving Questions With Brainpower
// Link: https://leetcode.com/problems/solving-questions-with-brainpower/

import java.util.Arrays;

public class SolvQueBrain_2140 {

    // TC: O(n), faster than 37%
    public long mostPoints(int[][] questions) {
        long[] dp = new long[questions.length];
        Arrays.fill(dp, -1);
        return mostPointsMemo(questions, 0, dp);
    }
    
    private long mostPointsMemo(int[][] que, int row, long[] dp) {
        
        if (row >= que.length) return 0;
        
        if (dp[row] != -1) return dp[row];
                
        return dp[row] = Math.max(
            que[row][0] + mostPointsMemo(que, row + que[row][1] + 1, dp), 
            mostPointsMemo(que, row + 1, dp)
            );
            
    }
    
}