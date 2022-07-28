package LeetCodeQuestions.LeetcodeSorting.Easy;

// Problem num: 1051 Height Checker
// Link: https://leetcode.com/problems/height-checker/


public class HeightChecker_1051 {

    // TC: O(n), using counting sort , faster than 95%
    public int heightChecker(int[] heights) {

        int[] expected = new int[heights.length];

        int max = 0;
        for (int ele : heights) max = Math.max(max, ele);

        int[] exp = new int[max + 1];


        for (int ele : heights) {
            exp[ele] = exp[ele] + 1;
        }

        int i = 0;
        int j = 0;
        while (i < exp.length) {
            if (exp[i] == 0) {
                i++;
            } else {
                expected[j] = i;
                exp[i] = exp[i] - 1;
                j++;
            }
        }

        int count = 0;
        for (int k = 0; k < heights.length; k++) {
            if (heights[k] != expected[k]) count++;
        }
        return count;

    }
}
