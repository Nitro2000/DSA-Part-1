package LeetCodeQuestions.LeetcodeSorting.Easy;

// Problem num: 1365 How Many Numbers Are Smaller Than the Current Number
// Link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

public class NumSmallerThanCurrent_1365 {

    // TC: O(n) using concept of counting sort, faster than 100%
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int max = 0;
        for (int i : nums) max = Math.max(max, i);

        int[] count = new int[max + 1];
        int[] allCount = new int[max + 1];

        for (int i: nums) ++count[i];

        int previous = 0;
        for (int i = 0; i < max + 1; i++) {
            allCount[i] = previous + count[i];
            previous = allCount[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = allCount[nums[i]] - count[nums[i]];
        }
        return nums;
    }
}
