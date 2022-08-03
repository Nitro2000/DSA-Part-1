package LeetCodeQuestions.LeetcodeSearch.Hard;

// Problem num: 41 First Missing Positive
// Link: https://leetcode.com/problems/first-missing-positive/

public class FirstMissPos_41 {

    // TC: O(n), faster than 93%
    public int firstMissingPositive(int[] nums) {
        
        int i = 0;
        while (i < nums.length) {
            if (nums[i] - 1 != i) {
                if (nums[i] <= 0 || nums[i] > nums.length || nums[i] == nums[nums[i] - 1]) i++;
                else swap(nums, i, nums[i] - 1);
            } else i++;
        }

        i = 0;
        while (i < nums.length) {
            if (nums[i] - 1 != i) return i + 1;
            else i++;
        }
        return nums.length + 1;
    }
    
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}