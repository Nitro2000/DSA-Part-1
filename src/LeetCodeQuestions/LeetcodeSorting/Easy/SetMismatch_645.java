package LeetCodeQuestions.LeetcodeSorting.Easy;

// Problem num: 645 Set Mismatch
// Link: https://leetcode.com/problems/set-mismatch/

public class SetMismatch_645 {

    // TC: O(n), faster than 60%, can be more optimised using binary or simple sum method
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[nums[i] - 1] != nums[i]) swap(nums, i, nums[i] - 1);
            else i++;
        }

        int[] ar = new int[2];
        for (i = 0; i < nums.length; i++) {
            if (nums[i] - 1 != i) {
                ar[0] = nums[i];
                ar[1] = i + 1;
            }
        }
        return ar;
    }

    private void swap(int[] ar, int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}
