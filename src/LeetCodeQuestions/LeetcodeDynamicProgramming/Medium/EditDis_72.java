package LeetCodeQuestions.LeetcodeDynamicProgramming.Medium;

// Problem num: 72  Edit Distance
// Link: https://leetcode.com/problems/edit-distance/

public class EditDis_72 {

    public int minDistance(String word1, String word2) {
//         int[][] dp = new int[word1.length()][word2.length()];
//         for (int[] i: dp) {
//             Arrays.fill(i, -1);
//         }
        // return minDistMemo(word1, word2, word1.length() - 1, word2.length() - 1, dp);
        return minDistTab(word1, word2, word1.length(), word2.length());
    }

    // TC: O(n * m), faster than 94%
    private int minDistMemo(String s, String ss, int inds, int indss, int[][] dp) {
        
        if (indss == -1 && inds == -1) return 0;
        if (indss == -1) return inds + 1;
        if (inds == -1) return indss + 1;
        
        if (dp[inds][indss] != -1) return dp[inds][indss];
        
        int same = 10001;
        int nSame = 10001;
        if (s.charAt(inds) == ss.charAt(indss)) {
            same = minDistMemo(s, ss, inds - 1, indss - 1, dp);
        } else {
            nSame = 1 + minDistMemo(s, ss, inds, indss - 1, dp); // When we insert char
            nSame = Math.min(1 + minDistMemo(s, ss, inds - 1, indss, dp), nSame); // When we delete
            nSame = Math.min(1 + minDistMemo(s, ss, inds - 1, indss - 1, dp), nSame); // Replace cond
        }
        
        return dp[inds][indss] = Math.min(same, nSame);        
    }

    // TC: O(n * m), faster than 94%
    private int minDistTab(String s, String ss, int inds, int indss) {
        int[][] dp = new int[inds + 1][indss + 1];
        
        for (int i = 0; i <= s.length(); i++) {
            for (int j = 0; j <= ss.length(); j++) {
                if (i == 0) dp[i][j] = j;
                else if (j == 0) dp[i][j] = i;
                else if (s.charAt(i - 1) == ss.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(1 + dp[i][j - 1], Math.min(1 + dp[i - 1][j], 1 + dp[i - 1][j - 1]));
                }
            }
        }
        
        return dp[inds][indss];
    }
}