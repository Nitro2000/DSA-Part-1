package LeetCodeQuestions.LeetCodeBitManipulation.Easy;

// Problem num: 461. Hamming Distance
// Link: https://leetcode.com/problems/hamming-distance/

public class HammingDist_461 {

    // TC: O(b), faster than 100%, b here is no of bits that are different in short the ans
    public int hammingDistance(int x, int y) {
        int count = 0;
        int ans = x ^ y;

        while (ans > 0) {
            ans -= ans & -ans;
            count++;
        }

        return count;
    }
}
