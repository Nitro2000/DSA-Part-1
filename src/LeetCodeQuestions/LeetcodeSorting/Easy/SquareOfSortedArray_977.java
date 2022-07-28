package LeetCodeQuestions.LeetcodeSorting.Easy;

// Problem num: 977 Squares of a Sorted Array
// Link: https://leetcode.com/problems/squares-of-a-sorted-array/

public class SquareOfSortedArray_977 {

    // TC: O(n), faster than 100%, but SC: O(n)
    public int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        int[] ar = new int[nums.length];
        int i = nums.length - 1;
        int j = 0;

        int index = i;
        while (j <= i) {
            if (nums[j] > nums[i]) {
                ar[index] = nums[j];
                j++;
            } else {
                ar[index] = nums[i];
                i--;
            }
            index--;
        }

        return ar;
    }
}
