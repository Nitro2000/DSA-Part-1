package LeetCodeQuestions.LeetcodeDynamicProgramming.Medium;

// Problem num: 698 Partition to K Equal Sum Subsets
// Link: https://leetcode.com/problems/partition-to-k-equal-sum-subsets/


public class PartitionEqualKSum_698 {

    // TC: O(2^kn), faster than 40%
    // TC: O(kn), faster than 50%
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        int max = 0;
        for (int i: nums) {
            sum += i;
            max = Math.max(max, i);
        }
        
        if (sum % k != 0 || max > sum / k) return false;
        
        int[][] dp = new int[nums.length + 1][sum]; // No use of dp can remove as well
        int[] eleSum = new int[k];
        
        // return canPartKSub(nums, 0, 0, sum / k, eleSum, dp);
        return canPartK(nums, 0, k, 0, sum / k, new boolean[nums.length]);
    }
    
    // Logic is making subset and check whether they are equal or not, to optimist we maintain a maxSum which should not be greater than sum to reduce further cases of recursion, no use of dp
    private boolean canPartKSub(int[] nums, int ind, int maxSum, int sum, int[] eleSum,  int[][] dp) {
        if (maxSum > sum) return false;  // checking maxSum of eleSum to not more than sum valid
        
        if (ind == nums.length) {
            
            for (int i : eleSum) {
                if (i != sum) return false;
            }
            return true;
        }
        
        // if (dp[ind][maxSum] != 0) return dp[ind][maxSum] == 1;
        
        boolean first = false;
        boolean sec = false;
        // Adding in non - empty set
        for (int i = 0; i < eleSum.length; i++) {
            if (eleSum[i] != 0) {
                int prev = maxSum;
                maxSum = Math.max(maxSum, eleSum[i] + nums[ind]);
                eleSum[i] += nums[ind];
                first = canPartKSub(nums, ind + 1, maxSum, sum, eleSum, dp);
                if (first) break;
                maxSum = prev;
                eleSum[i] -= nums[ind];
            }
        }
        
        // Adding at first empty-set
        if (!first) {
            for (int i = 0; i < eleSum.length; i++) {
                if (eleSum[i] == 0) {
                    int prev = maxSum;
                    maxSum = Math.max(maxSum, nums[ind]);
                    eleSum[i] = nums[ind];
                    sec = canPartKSub(nums, ind + 1, maxSum, sum, eleSum, dp);
                    maxSum = prev;
                    eleSum[i] = 0;
                    break;
                }
            
            }
        }
        
        boolean ans = first || sec;
        // dp[ind][maxSum] = ans ? 1: 2;
        return ans;
    }

    // sum = 4
    // [1,1,1,1,2,2,2,2], k = 4, ([1,2][1,2][1,2][1,2])

    // [3,2, 3, 4, 1, 1] k = 2 ([3,3,1], [2,4,1])

    // Optimise code, logic is we fill each bucket until currSum == sum, and make a visited array for elem visited before
    private boolean canPartK(int[] nums, int ind, int k, int currSum, int sum, boolean[] visited) {

        if (k == 0) return true;
        
        if (currSum == sum) {
            return canPartK(nums, 0, k - 1, 0, sum, visited);
        } else if (currSum > sum) return false;
        
        for (int i = ind; i < nums.length; i++) { // i start from ind to ensure to check elem after already taken to reduce repetative calls
            if (!visited[i]) {
                visited[i] = true;
                if (canPartK(nums, i + 1, k, currSum + nums[i], sum, visited)) return true;
                visited[i] = false;
            }
        }
        
        return false;
        
    }
}