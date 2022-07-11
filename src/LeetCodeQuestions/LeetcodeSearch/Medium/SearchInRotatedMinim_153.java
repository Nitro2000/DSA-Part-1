package LeetCodeQuestions.LeetcodeSearch.Medium;

// Problem num: 153 Find Minimum in Rotated Sorted Array
// Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

public class SearchInRotatedMinim_153 {

    // TC: O(log(n)), faster than 100%
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int temp = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[temp]) {
                end = mid - 1;
            } else {
                start = mid + 1;
                temp = mid;
            }
        }
        return temp + 1 < nums.length ? nums[temp + 1] : nums[0];
    }
}
