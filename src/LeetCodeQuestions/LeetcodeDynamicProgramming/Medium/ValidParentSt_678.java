package LeetCodeQuestions.LeetcodeDynamicProgramming.Medium;

// Problem num: 678 Valid Parenthesis String
// Link: https://leetcode.com/problems/valid-parenthesis-string/

public class ValidParentSt_678 {

    // TC: O(n), faster than 30%
    public boolean checkValidString(String s) {
        int[][] dp = new int[s.length() + 1][s.length() + 1];
        return checkValidStrMemo(s, 0, 0, dp);
    }
    
    private boolean checkValidStrMemo(String s, int ind, int curVal, int[][] dp) {
        
        if (curVal < 0) return false;
        
        if (ind == s.length()) {
            if (curVal == 0) return true;
            return false;
        }
        
        if (dp[ind][curVal] != 0) return dp[ind][curVal] == 1;
        char c = s.charAt(ind);
        
        boolean ans = false;
        
        if (c == '(') {
            ans = checkValidStrMemo(s, ind + 1, curVal + 1, dp);
        } else if (c == ')') {
            ans = checkValidStrMemo(s, ind + 1, curVal - 1, dp);
        } else {
            ans = checkValidStrMemo(s, ind + 1, curVal + 1, dp) || 
                checkValidStrMemo(s, ind + 1, curVal - 1, dp) ||
                checkValidStrMemo(s, ind + 1, curVal, dp);
        }
        
        dp[ind][curVal] = ans ? 1 : 2;
        return ans;
    }

}