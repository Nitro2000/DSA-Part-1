package LeetCodeQuestions.LeetcodeSorting.Easy;

// Problem num: 1331 Rank Transform of an Array
// Link: https://leetcode.com/problems/rank-transform-of-an-array/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransOfArr_1331 {

    // TC: O(nlog(n)), faster than 87%, SC: O(n)
    public int[] arrayRankTransform(int[] arr) {
        int[] ar = arr.clone();
        Arrays.sort(ar);
        Map<Integer, Integer> map = new HashMap<>();

        int rank = 0;
        int previous = Integer.MIN_VALUE; // you can take max as well rem only other than range given

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != previous) {
                rank++;
                map.put(ar[i], rank);
                previous = ar[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}
