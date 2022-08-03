package LeetCodeQuestions.LeetcodeSorting.Medium;

// Problem num: 179 Largest Number
// Link: https://leetcode.com/problems/largest-number/

public class LargestNumber_179 {

    // TC: O(n ^ 2), faster than 5%, you can make a O(n(log(n)) sorting tech using merge as well
    public String largestNumber(int[] nums) {

        boolean swapped;
        for (int i = 0; i < nums. length - 1; i++) {
            swapped = false;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (firstBig(nums[j], nums[j + 1])) {
                    swap(nums, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
        String s = "";
        for (int i : nums) s += i;
        return s.charAt(0) == '0' ? "0" : s;
    }

    private boolean firstBig (int a, int b) {
        return a * Math.pow(10, (b + "").length()) + b < b * Math.pow(10, (a + "").length()) + a;
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
