package LeetCodeQuestions.LeetcodeSorting.Easy;

// Problem num: 414 Third Maximum Number
// Link: https://leetcode.com/problems/third-maximum-number/

public class ThirdMaxNum_414 {

    // TC: O(n), faster than 97%
    public int thirdMax(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int count = 0;    // This is to check is there any integer with min value present
        int lower = 0;

        for (int i : nums) {
            if (i > max1) {
                max3 = max2;
                max2 = max1;
                max1 = i;
                count++;

            } else if (i > max2 && i != max1) {
                max3 = max2;
                max2 = i;
                count++;

            } else if (i > max3 && max1 != i && max2 != i) {
                max3 = i;
                count++;
            }

            if (i == Integer.MIN_VALUE) lower = 1;
        }

        return max3 != Integer.MIN_VALUE || count + lower >= 3 ? max3 : max1;
    }
}
