package LeetCodeQuestions.LeetcodeSearch.Medium;

// Problem num: 540 Single Element in a Sorted Array
// Link: https://leetcode.com/problems/single-element-in-a-sorted-array/

public class SingleElemSortedArray_540 {

    // TC: O(log(n)), faster than 100%
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid % 2 == 0) {
                if (mid + 1 < nums.length && nums[mid] == nums[mid + 1]) start = mid + 1;
                else {
                    end = mid - 1;
                }
            } else {
                if (mid - 1 >= 0 && nums[mid] == nums[mid - 1]) start = mid + 1;
                else end = mid - 1;
            }
        }
        return nums[start];
    }
}
