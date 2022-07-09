package LeetCodeQuestions.LeetcodeSearch.Medium;

// Problem num: 33 Search in Rotated Sorted Array
// Link: https://leetcode.com/problems/search-in-rotated-sorted-array/

public class SearchInRotatedDistinct {

    // TC: O(3log(n)) = O(log(n)), faster than 73%
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int temp = 0;
        while (start <= end) {
            int mid = start + (end - start);
            if (nums[mid] > nums[temp]) {
                start = mid + 1;
                temp = mid;
            } else  {
                end = mid - 1;
            }
        }

        // Now as we find the pivot i.e the highest element we can search between two arr
        int ans = binarySearch(nums, 0, temp, target);

        return ans != -1 ? ans : binarySearch(nums, temp + 1, nums.length - 1, target);

    }

    public int binarySearch (int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
