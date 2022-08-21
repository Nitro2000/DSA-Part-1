package LeetCodeQuestions.LeetCodeBitManipulation.Medium;

// Problem num: 29 Divide Two Integers
// Link: https://leetcode.com/problems/divide-two-integers/

public class Divide2Int_29 {

    // TC: O(log(n ^ 2)), faster than 30%
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        
        boolean sign = (dividend >= 0) == (divisor >= 0) ? true : false;
        
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        
        int quo = 0;
        while (dividend - divisor >= 0) {
            int count = 0;
            while (dividend - (divisor << 1 << count) >= 0) {
                count++;
            }
            quo += 1 << count;
            dividend -= divisor << count; 
        }
        
        return sign ? quo : -quo;
    }
}