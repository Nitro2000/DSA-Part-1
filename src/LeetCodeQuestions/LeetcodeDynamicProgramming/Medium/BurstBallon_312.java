package LeetCodeQuestions.LeetcodeDynamicProgramming.Medium;

// Problem num: 312 Burst Balloons
// Link: https://leetcode.com/problems/burst-balloons/

public class BurstBallon_312 {

    // TC: O(n * n)
    public int maxCoins(int[] nums) {
        int[][] dp = new int[nums.length][nums.length];
        return maxCoinMemo(nums, 0, nums.length - 1, dp);
    }
    
    private int maxCoinMemo(int[] nums, int i, int j, int[][] dp) {
        
        if (i > j) return 0;
        
        if (dp[i][j] != 0) return dp[i][j];
        int max = 0;
        for (int k = i; k <= j; k++) {
            int ans = value(nums, i - 1) * value(nums, k) * value(nums, j + 1);            
            ans += maxCoinMemo(nums, i, k - 1, dp);
            ans += maxCoinMemo(nums, k + 1, j, dp);
            max = Math.max(ans, max);
        }
        return dp[i][j] = max;
    }
    
    private int value(int[] nums, int ind) {
        if (ind == -1 || ind == nums.length) return 1;
        return nums[ind];
    }
}