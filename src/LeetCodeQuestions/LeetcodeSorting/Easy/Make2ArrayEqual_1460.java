package LeetCodeQuestions.LeetcodeSorting.Easy;

// Problem num: 1460 Make Two Arrays Equal by Reversing Sub-arrays
// Link: https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/

import java.util.HashMap;
import java.util.Map;

public class Make2ArrayEqual_1460 {

    // TC: O(n), faster than 100%
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] count = new int[1001];
        for (int i : target) ++count[i];

        for (int i = 0; i < target.length; i++) {
            if (count[arr[i]] == 0) return false;
            else --count[arr[i]];
        }
        return true;
    }
}
