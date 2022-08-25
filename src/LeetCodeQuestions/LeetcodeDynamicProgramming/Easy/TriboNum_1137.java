package LeetCodeQuestions.LeetcodeDynamicProgramming.Easy;

// Problem num: 1137. N-th Tribonacci Number
// Link: https://leetcode.com/problems/n-th-tribonacci-number/

public class TriboNum_1137 {

    // TC: O(n), faster than 100%
    public int tribonacci(int n) {
        // return triboMemo(n, new int[n + 1]);
        return triboTab(n);
    }
    
    private int triboMemo(int n, int[] dp) {
        if (n == 0) return 0;
        else if (n <= 2) return 1;
        
        if (dp[n] != 0) return dp[n];
        
        return dp[n] = triboMemo(n - 3, dp) + triboMemo(n - 2, dp) + triboMemo(n - 1, dp);
        
    }
    
    private int triboTab(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;
        
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;
        
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
        }
        
        return dp[n];
    }
}