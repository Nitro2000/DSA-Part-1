package LeetCodeQuestions.LeetcodeSorting.Easy;

// Problem num: 217 Contains Duplicate
// Link: https://leetcode.com/problems/contains-duplicate/

import java.util.HashMap;
import java.util.Map;

public class ContainsDup_217 {

    // TC: O(n), faster than 60%, SC: O(n)
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : nums) {
            if (map.get(i) != null) return true;
            else map.put(i, 1);
        }
        return false;
    }
}