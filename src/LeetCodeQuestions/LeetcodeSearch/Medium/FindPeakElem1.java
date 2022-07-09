package LeetCodeQuestions.LeetcodeSearch.Medium;

// Problem num: 162 Find Peak Element
// Link: https://leetcode.com/problems/find-peak-element/

public class FindPeakElem1 {

    // TC: O(log(n)) , faster than 100%
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid + 1 < nums.length) {
                if (nums[mid] > nums[mid + 1]) {
                    end = mid - 1;
                } else start = mid + 1;
            } else return end;
        }
        return start;
    }
}
