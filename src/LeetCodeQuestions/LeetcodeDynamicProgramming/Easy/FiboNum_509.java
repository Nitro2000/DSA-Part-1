package LeetCodeQuestions.LeetcodeDynamicProgramming.Easy;

// Problem num: 509 Fibonacci Number
// Link: https://leetcode.com/problems/fibonacci-number/

public class FiboNum_509 {

    // TC: O(n), faster than 100%, O(n) because of dp else its <= 2^n
    public int fib(int n) {
        // return fibMemo(n, new int[n + 1]);
        return fibTab(n);
    }
    
    private int fibMemo(int n, int[] dp) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        
        if (dp[n] != 0) return dp[n];
        
        return dp[n] = fibMemo(n - 1, dp) + fibMemo(n - 2, dp);
    }
    
    private int fibTab(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        if (n + 1 > 1) dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        return dp[n];
        
    }
}