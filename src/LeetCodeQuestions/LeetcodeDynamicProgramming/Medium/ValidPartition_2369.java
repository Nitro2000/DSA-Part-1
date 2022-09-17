package LeetCodeQuestions.LeetcodeDynamicProgramming.Medium;

// Problem num: 2369 Check if There is a Valid Partition For The Array
// Link: https://leetcode.com/problems/check-if-there-is-a-valid-partition-for-the-array/

public class ValidPartition_2369 {

    //TC: O(n), faster than 60%
    public boolean validPartition(int[] nums) {
        int[] dp = new int[nums.length + 1];

        return validPartitionMemo(nums, 0, dp);
    }

    private boolean validPartitionMemo(int[] nums, int k, int[] dp) {
        if (k >= nums.length) return true;

        if (dp[k] != 0) return dp[k] == 1;

        boolean first = isValid(nums, k, k + 2);
        boolean sec = false;
        if (first ) sec = validPartitionMemo(nums, k + 2, dp);

        if (sec) {
            dp[k] = 1;
            return true;
        }
        dp[k] = 2;

        first = isValid(nums, k, k + 3);
        if (first) sec = validPartitionMemo(nums, k + 3, dp);

        if (sec) {
            dp[k] = 1;
            return true;
        }
        dp[k] = 2;
        return false;
    }

    private boolean isValid(int[] nums, int i, int k) {
        if (k > nums.length) return false;
        if (k - i == 2) return nums[i] == nums[k - 1];

        if (k - i == 3) {
            if (nums[i] == nums[i + 1]) {
                return nums[i] == nums[k - 1];
            } else {
                for (int j = i; j < k - 1; j++) {
                    if (nums[j] + 1 != nums[j + 1]) return false;
                }
                return true;
            }
        }
        return false;
    }
}
