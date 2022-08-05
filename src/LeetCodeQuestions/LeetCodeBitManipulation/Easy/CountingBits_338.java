package LeetCodeQuestions.LeetCodeBitManipulation.Easy;

// Problem num: 338 Counting Bits
// Link: https://leetcode.com/problems/counting-bits/

public class CountingBits_338 {

    // TC: O(n + b), faster than 57%,
    public int[] countBits(int n) {
        int[] ar = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            int ans = i;
            int count = 0;
            while (ans > 0) {
                count++;
                ans -= ans & (-ans);
            }
            ar[i] = count;
        }
        return ar;
    }
}
