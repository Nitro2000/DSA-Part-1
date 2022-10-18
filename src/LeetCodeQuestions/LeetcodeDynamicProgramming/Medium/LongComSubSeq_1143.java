package LeetCodeQuestions.LeetcodeDynamicProgramming.Medium;

// Problem num: 1143 Longest Common Subsequence
// Link https://leetcode.com/problems/longest-common-subsequence/

public class LongComSubSeq_1143 {

    // TC: O(m * n), faster than 70%
    public int longestCommonSubsequence(String text1, String text2) {
        // int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        // for (int[] i: dp) {
        //     Arrays.fill(i, -1);
        // }
        // return longComMemo(text1, text2, 0, 0, dp);
        return longComTab(text1, text2);
    }
    
    private int longComMemo(String s, String ss, int ind, int ind2, int[][] dp) {
        
        if (ind == s.length() || ind2 == ss.length()) {
            return 0;
        }
        
        if (dp[ind][ind2] != -1) return dp[ind][ind2];
        
        int found = 0;
        int nFound = 0;
        if (s.charAt(ind) == ss.charAt(ind2)) {
            found = 1 + longComMemo(s, ss, ind + 1, ind2 + 1, dp);
        } else {
           nFound = Math.max(longComMemo(s, ss, ind + 1, ind2, dp),
            longComMemo(s, ss, ind, ind2 + 1, dp));
        }
        return dp[ind][ind2] = Math.max(found, nFound);        
    }
    
    private int longComTab(String s, String ss) {
        int[][] dp = new int[s.length() + 1] [ss.length() + 1];
        
        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; j <= ss.length(); j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                    continue;
                }
            
                if (s.charAt(i - 1) == ss.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        
        return dp[s.length()][ss.length()];
        
    }
}