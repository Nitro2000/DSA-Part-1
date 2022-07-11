package LeetCodeQuestions.LeetcodeSearch.Medium;


// Problem num: 1954 Minimum Garden Perimeter to Collect Enough Apples
// Link: https://leetcode.com/problems/minimum-garden-perimeter-to-collect-enough-apples/

public class MinGardenPerimeter_1954 {

    // TC: O(log(10^6)) = O(1) constant, faster than 98%
    public long minimumPerimeter(long neededApples) {
        long start = 1;
        long end = 1000000;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (checkMid(mid, neededApples))
                end = mid - 1;
            else start = mid + 1;
        }
        return 2 * start * 4; // as we consider length of square to be 2n
    }

    public boolean checkMid(long mid, long neededApples) {
        long quadApples = 2 * mid * (mid * (mid + 1) / 2); // These are the apples at quadrant //excluding axis like for len = 2, points at quadrant are (1,2), (2, 2), (2, 1)
        long axisApples = mid * (mid + 1) / 2;
        long total = 4 * (quadApples + axisApples);
        return total >= neededApples;
    }
}
