package LeetCodeQuestions.LeetcodeSearch.Easy;


// Problem num: 704 Binary Algorithms.Search
// Link: https://leetcode.com/problems/binary-search/

public class BinarySearch_704 {

    // TC: O(log(n)) faster than 100%
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
