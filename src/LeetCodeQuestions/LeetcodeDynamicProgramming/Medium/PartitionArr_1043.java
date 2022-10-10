package LeetCodeQuestions.LeetcodeDynamicProgramming.Medium;

// Problem num: 1043 Partition Array for Maximum Sum
// Link: https://leetcode.com/problems/partition-array-for-maximum-sum/

public class PartitionArr_1043 {

    // TC: O(n), faster than 77%
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp = new int[arr.length + 1];
        return maxSumMemo(arr, 0, k, dp);
    }
    
    private int maxSumMemo(int[] arr, int ind, int k, int[] dp) {
        if (ind == arr.length) return 0;
        
        if (dp[ind] != 0) return dp[ind];
        
        int ans = 0;
        int len = 0;
        int max = Integer.MIN_VALUE;
        for (int i = ind; i < Math.min(ind + k, arr.length); i++) {
            int sum = 0;
            len++;
            max = Math.max(max, arr[i]);
            sum = len * max + maxSumMemo(arr, i + 1, k, dp);
            ans = Math.max(sum, ans);
        }
        
        return  dp[ind] = ans;
    }
}