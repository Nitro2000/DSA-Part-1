package LeetCodeQuestions.LeetcodeSorting.Medium;

// Problem num: 287 Find the Duplicate Number
// Link: https://leetcode.com/problems/find-the-duplicate-number/

public class FindDuplicate_287 {

    // TC: O(n), faster than 86%, using cycle sort
    public int findDuplicate(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            if (nums[i] - 1 != i) {
                if (nums[i] == nums[nums[i] - 1]) return nums[i];
                else swap(nums, i, nums[i] - 1);
            } else i++;
        }

        return 0;
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
