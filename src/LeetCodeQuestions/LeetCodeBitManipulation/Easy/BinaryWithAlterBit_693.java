package LeetCodeQuestions.LeetCodeBitManipulation.Easy;

// Problem num: 693 Binary Number with Alternating Bits
// Link: https://leetcode.com/problems/binary-number-with-alternating-bits/

public class BinaryWithAlterBit_693 {

    // TC: O(k), where k is no. of bits or O(log(n)) , faster than 100%
    public boolean hasAlternatingBits(int n) {
        
        int prev = n & 1;
        n = n >> 1;
        while (n > 0) {
            if (prev == (n & 1)) return false;
            prev = n & 1;
            n = n >> 1; 
             
        }
        return true;
    }
}