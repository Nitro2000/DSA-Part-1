package LeetCodeQuestions.LeetcodeDynamicProgramming.Medium;

// Problem num: 1312 Minimum Insertion Steps to Make a String Palindrome
// Link: https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/

public class MinInsMakeStrPallin_1312 {

    public int minInsertions(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String rev = sb.toString();
        return minInserTab(s, rev);
    }

    // TC: O(n2) where n is string length, faster than 40%
    private int minInserTab(String s, String rev) {
        int[][] dp = new int[s.length() + 1][rev.length() + 1];
        
        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; j <= rev.length(); j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (s.charAt(i - 1) == rev.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        
        return s.length() - dp[s.length()][rev.length()];
    }
}