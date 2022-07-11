package LeetCodeQuestions.LeetcodeSearch.Medium;

// Problem num: 2070 Most Beautiful Item for Each Query
// Link: https://leetcode.com/problems/most-beautiful-item-for-each-query/

import java.util.*;

public class MostBeautifulItem_2070 {

    // TC: O(nlog(n) + O(n) + O(mlog(n))) = O((n + m)(log(n)), faster than 90%
    public int[] maximumBeauty(int[][] items, int[] queries) {

        Arrays.sort(items, (a, b) -> a[0] - b[0]);

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        int max = 0;

        for (int[] i : items) {
            if (i[1] > max) {
                map.put(i[0], i[1]);
                list.add(i[0]);
                max = i[1];
            }
        }


        for (int i = 0; i < queries.length; i++) {
            queries[i] = map.getOrDefault(binarySearch(list, queries[i]), 0);
        }
        return queries;
    }

    private int binarySearch(List<Integer> ar, int target) {
        int start = 0;
        int end = ar.size() - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (ar.get(mid) > target) end = mid - 1;
            else start = mid + 1;
        }
        return end < 0 ? 0 : ar.get(end);
    }
}
