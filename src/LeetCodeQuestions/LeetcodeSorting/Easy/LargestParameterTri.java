package LeetCodeQuestions.LeetcodeSorting.Easy;

// Problem num: 628 Maximum Product of Three Numbers
// Link: https://leetcode.com/problems/maximum-product-of-three-numbers/


import java.util.Arrays;

public class LargestParameterTri {

    // TC: O(nlog(n)) because of sorting, faster than 71% (logic is 100% faster if u refresh and submit)
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for (int i = nums.length - 1; i > 1; i--) {
            if (validTri(nums[i - 1], nums[i - 2], nums[i])) return nums[i] + nums[i - 1] + nums[i - 2];
        }
        return 0;
    }

    private boolean validTri(int a, int b, int c) {
        return a + b > c;
    }
}
