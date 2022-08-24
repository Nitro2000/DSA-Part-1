package LeetCodeQuestions.LeetcodeDynamicProgramming.Easy;

// Problem num: 392 Is Subsequence
// Link: https://leetcode.com/problems/is-subsequence/

public class IsSubs_392 {

    // TC: O(t.length()), faster than 80%
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        if (s.length() == 0) return true;
        
        while (i != t.length() && j != s.length()) {
            if (s.charAt(j) != t.charAt(i)) i++;
            else {
                j++;
                i++;
            }
        }
        
        return j == s.length();
    }
}