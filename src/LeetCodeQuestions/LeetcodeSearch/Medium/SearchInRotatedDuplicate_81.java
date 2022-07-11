package LeetCodeQuestions.LeetcodeSearch.Medium;

// Problem num: 81 Search in Rotated Sorted Array II
// Link: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

// Main logic is we have to skip duplicates elements (start++, end--) by checking if they are pivot or not,
public class SearchInRotatedDuplicate_81 {

    // TC: O(3log(n)), faster than 85%
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        // Finding pivot
        int temp = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[temp]) {
                end = mid - 1;
            } else {
                // To check if all start, mid, end element are equal
                if (nums[mid] == nums[temp] && nums[mid] == nums[end]) {

                    // Checking whether start is the pivot
                    if (start + 1 < nums.length && nums[start] > nums[start + 1]) {
                        temp = start;
                        break;
                    } else start++;

                    // Checking whether end is the pivot
                    if (end - 1 > 0 && nums[end] < nums[end - 1]) {
                        temp = end;
                        break;
                    } else end--;
                } else {
                    start = mid + 1;
                    temp = mid;
                }
            }
        }

        boolean ans = binarySearch(nums, 0, temp, target);
        return ans ? ans : binarySearch(nums, temp + 1, nums.length - 1, target);

    }

    public boolean binarySearch(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return true;
            else if (nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return false;
    }
}
