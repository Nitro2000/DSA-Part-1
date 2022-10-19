package LeetCodeQuestions.LeetcodeDynamicProgramming.Medium;

// Problem num: 583 Delete Operation for Two Strings
// Link: https://leetcode.com/problems/delete-operation-for-two-strings/

public class MinDelOpeTwoStr_583 {
    public int minDistance(String word1, String word2) {
        return minDistanceTab(word1, word2);
    }

    // TC: O(n * m), faster than 60%
    private int minDistanceTab(String s, String ss) {
        int[][] dp = new int[s.length() + 1][ss.length() + 1];
        
        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; j <= ss.length(); j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (s.charAt(i - 1) == ss.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
                
            }
        }
        
        return s.length() + ss.length() - 2 * dp[s.length()][ss.length()];
    }
}