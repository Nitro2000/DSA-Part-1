package LeetCodeQuestions.LeetcodeSorting.Easy;

// Problem num : 922 Sort Array By Parity II
// Link : https://leetcode.com/problems/sort-array-by-parity-ii/

public class SortArrByParitry2_922 {

    // TC: O(n), faster than 89%, SC: O(1)
    public int[] sortArrayByParityII(int[] nums) {

        int i = 0;
        int j = 1;
        int ele = nums[0];

        while (i < nums.length || j < nums.length) {
            if (ele % 2 == 0) {
                nums[i] = ele;
                if (i + 2 < nums.length) ele = nums[i + 2];
                else break;
                i += 2;
            } else {
                int temp = nums[j];
                nums[j] = ele;
                ele = temp;
                j += 2;
            }
        }
        return nums;
    }
}
