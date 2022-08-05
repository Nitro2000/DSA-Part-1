package LeetCodeQuestions.LeetCodeBitManipulation.Easy;

// Problem num: 1486. XOR Operation in an Array
// Link: https://leetcode.com/problems/xor-operation-in-an-array/

public class XORInArr_1486 {

    // TC: O(n), faster than 100%;
    public int xorOperation(int n, int start) {
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int val = start + 2 * i;
            ans ^= val;
        }
        return ans;
    }
}