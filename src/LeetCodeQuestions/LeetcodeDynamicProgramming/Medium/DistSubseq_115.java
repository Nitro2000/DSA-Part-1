package LeetCodeQuestions.LeetcodeDynamicProgramming.Medium;

// Problem num: 115 Distinct Subsequences
// Link: https://leetcode.com/problems/distinct-subsequences/

import java.util.Arrays;

public class DistSubseq_115 {

    public int numDistinct(String s, String t) {
//        int[][] dp = new int[s.length() + 1][t.length() + 1];
//        for (int[] j: dp) {
//            Arrays.fill(j, -1);
//        }
        // return numDistMemo(s, t, s.length(), t.length(), dp);
        return numDistTab(s, t);
    }
    // TC: O(n * m),faster than 80%
    private int numDistMemo(String s, String t, int inds, int indt, int[][] dp) {
        
        if (indt == 0) {
            return 1;
        }
        if (inds == 0) return 0;
        
        if (dp[inds][indt] != -1) return dp[inds][indt];
        
        int eq = 0;
        int not = 0;
        if (s.charAt(inds - 1) == t.charAt(indt - 1)) {
            eq = numDistMemo(s, t, inds - 1, indt - 1, dp);
        } 
        not = numDistMemo(s, t, inds - 1, indt, dp);
        return dp[inds][indt] = eq + not;
    }
    
    private int numDistTab(String s, String t) {
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        
        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; j <= t.length(); j++) {
                if (j == 0) {
                    dp[i][j] = 1;

                } else if (i == 0) {
                    dp[i][j] = 0;
                } else {
                    if (s.charAt(i - 1) == t.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1];
                    }
                    dp[i][j] += dp[i - 1][j];
                } 
            }
        }
        
        return dp[s.length()][t.length()];
        
        
    }
}