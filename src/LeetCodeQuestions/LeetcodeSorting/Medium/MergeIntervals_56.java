package LeetCodeQuestions.LeetcodeSorting.Medium;

// Problem num: 56 Merge Intervals
// Link: https://leetcode.com/problems/merge-intervals/

import java.util.*;

public class MergeIntervals_56 {

    // TC: O(nlog(n)), faster than 50% can optimise try using hash map , and max variable
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> ls = new ArrayList<>();

        int i = 0;
        int j = 0;
        int max = 0;
        while(i < intervals.length - 1){
            max = Math.max(max, intervals[i][1]);
            if (max < intervals[i + 1][0]) {
                ls.add(new int[]{intervals[j][0], max});
                j = i + 1;
            }
            i++;
        }
        max = Math.max(max, intervals[intervals.length - 1][1]);
        ls.add(new int[]{intervals[j][0], max});

        return  ls.toArray(new int[0][]);

    }

}