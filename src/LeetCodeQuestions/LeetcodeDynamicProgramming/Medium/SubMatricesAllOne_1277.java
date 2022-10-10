package LeetCodeQuestions.LeetcodeDynamicProgramming.Medium;

// Problem num: 1277 Count Square Submatrices with All Ones
// Link: https://leetcode.com/problems/count-square-submatrices-with-all-ones/

public class SubMatricesAllOne_1277 {

    public int countSquares(int[][] matrix) {
        return countSquaresTab(matrix);
    }

    // TC: O(nm), faster than 93%
    private int countSquaresTab(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] dp = new int[row][col];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                
                // Logic is to calculate that the ele is a bottom right element of how much matrixes
                int val = matrix[i][j];
                if (val == 0) dp[i][j] = 0;
                else if (i - 1 < 0 || j - 1 < 0) {
                    dp[i][j] = 1;
                } else  {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                }
            }
        }
        
        int ans = 0;
        for (int[] ar : dp) {
            for (int i: ar) ans += i;
        }
        
        return ans;
    }
    
}