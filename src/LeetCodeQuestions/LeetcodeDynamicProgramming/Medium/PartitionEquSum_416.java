package LeetCodeQuestions.LeetcodeDynamicProgramming.Medium;

// Problem num: 416 Partition Equal Subset Sum
// Link: https://leetcode.com/problems/partition-equal-subset-sum/

public class PartitionEquSum_416 {

    // TC: O(n), faster than 50%
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i: nums) sum += i;
        if (sum % 2 != 0) return false; 
        
        int[][] dp = new int[nums.length + 1][20001];
        return canPartMemo(nums, 0, 0, sum, dp);
    }


    private boolean canPartMemo(int[] nums, int ind, int firSum, int sum, int[][] dp) {
        
        if (ind == nums.length) {
            if (2 * firSum == sum) return true;
            return false;
        }
        
        if (dp[ind][firSum] != 0) return dp[ind][firSum] == 1;
        
        boolean ans = canPartMemo(nums, ind + 1, firSum + nums[ind], sum, dp) || 
            canPartMemo(nums, ind + 1, firSum, sum, dp);
        
        dp[ind][firSum] = ans ? 1 : 2;
        return ans;
        
    }
}