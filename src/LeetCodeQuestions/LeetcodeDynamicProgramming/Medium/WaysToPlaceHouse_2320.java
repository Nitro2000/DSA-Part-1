package LeetCodeQuestions.LeetcodeDynamicProgramming.Medium;

// Problem num: 2320 Count Number of Ways to Place Houses
// Link: https://leetcode.com/problems/count-number-of-ways-to-place-houses/

public class WaysToPlaceHouse_2320 {

    // TC: O(n), faster than 60%
    public int countHousePlacements(int n) {
        // int[] dp = new int[n + 1];
        // long ans = countMemo(n, 0, dp) + 1;
        long ans = countTab(n) + 1;
        return (int)((ans * ans) % 1000000007);
    }
    
    private int countMemo(int n, int k, int[] dp) {
        if (k >= n) return 0;
        
        if (dp[k] != 0) return dp[k];
        
        int first = 1 + countMemo(n, k + 2, dp) % 1000000007;
        int sec = countMemo(n, k + 1, dp) % 1000000007;
        
        return dp[k] = (first + sec) % 1000000007;
    }
    
    
    private int countTab(int n) {
        int[] dp = new int[n];
        
        dp[0] = 1;
        if (n >= 2) dp[1] = 2;
        
        for (int i = 2; i < n; i++) {
            dp[i] = (1 + dp[i - 2] + dp[i - 1]) % 1000000007;       
        }
        
        return dp[n - 1];
    }
}