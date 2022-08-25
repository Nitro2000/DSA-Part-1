package LeetCodeQuestions.LeetcodeDynamicProgramming.Easy;

// Problem num: 1646 Get Maximum in Generated Array
// Link: https://leetcode.com/problems/get-maximum-in-generated-array/

public class GetMaxGenArr_1646 {

    // TC: O(n), faster than 100%
    public int getMaximumGenerated(int n) {
        if (n <= 1) return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        int max = 1;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) dp[i] = dp[i / 2];
            else dp[i] = dp[i / 2] + dp[i / 2 + 1];
            max = Math.max(dp[i], max);
        }
        
        return max;
        
    }
}