package LeetCodeQuestions.LeetCodeArray.Easy;

// Problem num: 2418 Sort the People
// Link https://leetcode.com/problems/sort-the-people/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortPeople_2418 {

    // TC: O(nlogn), faster than 45%
    public String[] sortPeople(String[] names, int[] heights) {
        int len = heights.length;
        String[] ar = new String[names.length];
        
        Map<Integer, String> map = new HashMap<>();
        for(int i = 0; i < len; i++) {
            map.put(heights[i], names[i]);
        }
        
        Arrays.sort(heights);
        
        for (int i = 0; i < len; i++) {
            ar[i] = map.get(heights[len - 1 - i]);
        }
        return ar;
    }
}