package LeetCodeQuestions.LeetcodeSearch.Medium;


// Problem num: 74 Search a 2D Matrix
// Link: https://leetcode.com/problems/search-a-2d-matrix/

public class SearchIn2D_74 {

    // TC: O(log(n*m)), faster than 100%
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0;
        int end = n * m - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (matrix[mid/n][mid%n] == target) return true;
            else if (matrix[mid/n][mid%n] > target) end = mid - 1;
            else start = mid + 1;
        }
        return false;
    }
}
