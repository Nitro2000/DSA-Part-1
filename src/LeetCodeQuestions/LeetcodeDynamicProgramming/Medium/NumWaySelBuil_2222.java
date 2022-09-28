package LeetCodeQuestions.LeetcodeDynamicProgramming.Medium;

// Problem num: 2222 Number of Ways to Select Buildings
// Link: https://leetcode.com/problems/number-of-ways-to-select-buildings/

import java.util.Arrays;

public class NumWaySelBuil_2222 {

    // TC: O(4 * 3 * n), faster than 5%, because uses dp, u can do with greedy also
    public long numberOfWays(String s) {
        long[][][] dp = new long[4][3][s.length()];
        for (long[][] i : dp) {
            for (long[] j: i) Arrays.fill(j, -1);
        }
    
        return numWaysMemo(s, 0, 0, 2, dp);
    }
    
    private long numWaysMemo(String s, int curr, int len, int prev, long[][][] dp) {
        
        if (len == 3) return 1;
        if (curr ==  s.length()) return 0;
    
        
        if (dp[len][prev][curr] != -1) return dp[len][prev][curr];
        
        long taken = 0;
        if (prev != s.charAt(curr) - 48) {
            taken = numWaysMemo(s, curr + 1, len + 1, s.charAt(curr) - 48, dp);
        }
        taken += numWaysMemo(s, curr + 1, len, prev, dp);
        return dp[len][prev][curr] = taken;
    }
    
    
    
    
}