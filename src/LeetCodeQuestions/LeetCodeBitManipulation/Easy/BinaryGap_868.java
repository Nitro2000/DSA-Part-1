package LeetCodeQuestions.LeetCodeBitManipulation.Easy;

// Problem num: 868 Binary Gap
// Link: https://leetcode.com/problems/binary-gap/

public class BinaryGap_868 {

    // TC: O(log(n)), faster than 90%
    public int binaryGap(int n) {
        int prev = n & -n;
        n -= prev;
        prev = (int) (Math.log(prev) / Math.log(2));
        int curr = 0;
        int max = 0;
        while (n > 0) {
            curr = n & -n;
            n -= curr;
            curr = (int) (Math.log(curr) / Math.log(2));
            max = Math.max(max, curr - prev);
            prev = curr;
        }
        return max;
    }
}