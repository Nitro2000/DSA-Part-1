package LeetCodeQuestions.LeetcodeSearch.Medium;

// Problem num: 34 Find First and Last Position in Sorted Array
// Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FindFirstLastPos {

    // TC: O(log(n)), faster than 100%
    public int[] searchRange(int[] nums, int target) {
        return new int[]{binarySearch(nums, target, true), binarySearch(nums, target, false)};
    }

    public int binarySearch(int[] nums, int target, boolean isFirst) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                if (isFirst) end = mid - 1;
                else start = mid + 1;
                ans = mid;
            } else if (nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return ans;
    }
}
