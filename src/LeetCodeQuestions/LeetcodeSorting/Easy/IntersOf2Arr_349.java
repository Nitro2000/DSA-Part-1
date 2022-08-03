package LeetCodeQuestions.LeetcodeSorting.Easy;

// Problem num: 349 Intersection of Two Arrays
// Link: https://leetcode.com/problems/intersection-of-two-arrays/

import java.util.*;

public class IntersOf2Arr_349 {

    // TC: O(n), faster than 87%, SC: O(n)
    public int[] intersection(int[] nums1, int[] nums2) {
        
        List<Integer> ls = new ArrayList<>();
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : nums1) map.put(i, 1);
        
        for (int i : nums2) {
            if (map.getOrDefault(i, 0) != 0) {
                ls.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        
        int[] ar = new int[ls.size()];
        for (int i = 0; i < ls.size(); i++) ar[i] = ls.get(i);
        return ar;
    }
}