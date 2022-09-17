package LeetCodeQuestions.LeetcodeDynamicProgramming.Medium;

// Problem num: 2370 Longest Ideal Subsequence
// Link: https://leetcode.com/problems/longest-ideal-subsequence/

public class LongIdealSubseq_2370 {

    // TC: O(n*k) faster than 100%
    public int longestIdealString(String s, int k) {
        
        // Will store the longest subseq length if character end with the index of dp (ex a = 0, b=1)
        int[] dp = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 97;
            
            // Making range for the current char 
            int left = c - k < 0 ? 0 : c - k;
            int right = c + k > 25 ? 25 : c + k;
            
            // Finding previous max value in the range 
            int max = 0;
            for (int j = left; j <= right; j++) {
                max = Math.max(dp[j], max);
            }
            
            dp[c] = max + 1;
        }
        
        int max = 0;
        for (int i : dp) max = Math.max(i, max);
        return max;
    }
}