package LeetCodeQuestions.LeetCodeBitManipulation.Easy;

// Problem num: 1720 Decode XORed Array
// Link: https://leetcode.com/problems/decode-xored-array/

public class DecodeXor_1720 {

    // TC: O(n), faster than 100%
    public int[] decode(int[] encoded, int first) {
        int[] ar = new int[encoded.length + 1];
        ar[0] = first;
        for (int i = 1; i <= encoded.length; i++) {
            ar[i] = encoded[i - 1] ^ ar[i - 1];
        }
        return ar;
    }
}