package LeetCodeQuestions.LeetcodeSorting.Easy;

// Problem num : 905 Sort Array By Parity
// Link : https://leetcode.com/problems/sort-array-by-parity/

public class SortArrByParity_905 {

    // TC: O(n), faster than 100%, SC: O(1)
    public int[] sortArrayByParity(int[] nums) {

        int i = 0;
        int j = nums.length - 1;
        int ele = nums[0];
        int temp = 0;

        while (i <= j) {
            if (ele % 2 != 0) {
                temp = nums[j];
                nums[j] = ele;
                j--;
                ele = temp;

            } else {
                nums[i] = ele;
                i++;
                if (i < nums.length) ele = nums[i];  // Because we already take 0th element
                else break;
            }
        }
        return nums;
    }
}
