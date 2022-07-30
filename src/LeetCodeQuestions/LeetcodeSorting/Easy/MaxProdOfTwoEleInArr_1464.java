package LeetCodeQuestions.LeetcodeSorting.Easy;

// Problem num: 1464 Maximum Product of Two Elements in an Array
// Link: https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/

public class MaxProdOfTwoEleInArr_1464 {

    // TC: O(n), faster than 100%
    public int maxProduct(int[] nums) {

        int max1 = 0;
        int max2 = 0;

        for (int i : nums) {
            if (i > max1) {
                max2 = max1;
                max1 = i;
            } else if (i > max2) {
                max2 = i;
            }
        }

        return (max1 - 1) * (max2 - 1);
    }
}
