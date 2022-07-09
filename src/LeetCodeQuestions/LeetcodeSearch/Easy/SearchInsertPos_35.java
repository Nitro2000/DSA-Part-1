package Search.LeetcodeSearch.Easy;

// Problem num: 35 Search insert position
// Link: https://leetcode.com/problems/search-insert-position/
class SearchInsertPos_35 {

    // TC: O(log(n)) faster than 100%
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start - (start - end) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return start;
    }
}