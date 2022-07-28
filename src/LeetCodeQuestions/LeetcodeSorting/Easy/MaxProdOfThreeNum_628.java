package LeetCodeQuestions.LeetcodeSorting.Easy;

// Problem num: 628 Maximum Product of Three Numbers
// Link: https://leetcode.com/problems/maximum-product-of-three-numbers/

import java.util.Arrays;

public class MaxProdOfThreeNum_628 {

    // TC: O(nlog(n)), faster than 47%
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int last = nums.length - 1;

        int max = nums[last] * nums[last - 1] * nums[last - 2];
        if (nums[0] < 0 && nums[1] < 0) {
            max = Math.max(max, nums[0] * nums[1] * nums[last]);
        }
        return max;
    }
}
