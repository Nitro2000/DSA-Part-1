package Search.LeetcodeSearch;

// Problem num: 1351 Count Negative Numbers in a Sorted Matrix
// Link: https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

class CountNegNumInMatrix {

    // TC O(n + m) faster than 100%
    public int countNegatives(int[][] grid) {
        int m = grid.length - 1;
        int n = grid[0].length - 1;
        int row = 0;
        int column = 0;
        int count = 0;
        while (m + n - row - column + 1 > 0) {

            if (grid[m][n] >= 0) break;

            if (grid[row][n] < 0 && grid[m][column] < 0) {
                count += m - row + n - column + 1;
                m -= 1;
                n -= 1;
            } else if (grid[row][n] < 0 && grid[m][column] >= 0) {
                n -= 1;
                column++;
                count += m - row + 1;
            } else if (grid[row][n] >= 0 && grid[m][column] < 0) {
                count += n - column + 1;
                row++;
                m -= 1;
            } else {
                row++;
                column++;
            }
        }

        return count;
    }

    // Second way easy to understand TC: O(n + m), faster than 100%
    public int countNegative(int[][] grid) {
        int count = 0;
        int row = 0;
        int col = grid[0].length-1;

        while(row < grid.length && col >= 0 )
        {
            if(grid[row][col] < 0)
            {
                count = count + (grid.length - row);
                col--;
            }
            else
            {
                row++;
            }
        }
        return count;
    }

}