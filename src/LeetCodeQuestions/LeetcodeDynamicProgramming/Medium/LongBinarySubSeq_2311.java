package LeetCodeQuestions.LeetcodeDynamicProgramming.Medium;

// Problem num: 2311 Longest Binary Subsequence Less Than or Equal to K
// Link: https://leetcode.com/problems/longest-binary-subsequence-less-than-or-equal-to-k/

public class LongBinarySubSeq_2311 {

    // TC: O(n), faster than 84% but i think it should be 100% faster, SC: O(1), lesser than 96%
    public int longestSubsequence(String s, int k) {
        return longestSubTab(s, k, s.length());
    }
    
    private int longestSubTab(String s, int k, int len) {
        
        int dpLen = 1;
        int dpVal = s.charAt(len - 1) - 48;

        for (int i = len - 2; i >= 0; i--) {
            if (s.charAt(i) - 48 == 0) {
                dpLen += 1;
                continue;
            }
            int newVal = (int) Math.pow(2, dpLen) * (s.charAt(i) - 48) + dpVal;
            if (newVal <= k && newVal >= 0) {
                dpLen += 1;
                dpVal = newVal;
            }                       
        }
        
        return dpLen;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}