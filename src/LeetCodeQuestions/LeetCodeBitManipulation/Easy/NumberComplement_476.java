package LeetCodeQuestions.LeetCodeBitManipulation.Easy;

// Problem num: 476 Number Complement
// Link: https://leetcode.com/problems/number-complement/


public class NumberComplement_476 {

    // TC: O(n), faster than 60%
    public int findComplement(int num) {
        int ans = 0;
        int i = 0;
        while (num > 0) {
            if ((num & 1) == 0) ans += Math.pow(2, i);
            num = num >> 1;
            i++;
        }
        return ans;
    }
}
