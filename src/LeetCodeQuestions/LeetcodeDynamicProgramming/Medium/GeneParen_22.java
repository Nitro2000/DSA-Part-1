package LeetCodeQuestions.LeetcodeDynamicProgramming.Medium;

// Problem num: 22 Generate Parentheses
// Link: https://leetcode.com/problems/generate-parentheses/

import java.util.ArrayList;
import java.util.List;

public class GeneParen_22 {
    
    List<String> glob = new ArrayList<>();

    // TC: O(n), due to dp, else n2, faster than 70%;
    public List<String> generateParenthesis(int n) {
        
        String[][] dp = new String[n * 2 + 1][n + 1];
        
        genPara(n * 2, 0, 0, "", dp);
        return glob;
    }
    
    private void genPara(int n, int ind, int val, String ans, String[][] dp) {
        if (n == ind) {
            if (val == 0) {
                dp[ind][val] = ans;
                glob.add(ans);
            }
            return;
        }
        
        if (val > n / 2) return;
        // int takeOpen = 0;
        // int takeClose = 0;
        // takeOpen = 
        
        if (dp[ind][val] != null) {
            glob.add(ans);
            return;
        }
        
        genPara(n, ind + 1, val + 1, ans + "(", dp);
        
        if (val > 0) {
            genPara(n, ind + 1, val - 1, ans + ")", dp);
        }
    }
}