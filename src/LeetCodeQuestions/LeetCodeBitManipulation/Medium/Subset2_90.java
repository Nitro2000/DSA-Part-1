package LeetCodeQuestions.LeetCodeBitManipulation.Medium;

// Problem num: 90 Subsets II
// Link: https://leetcode.com/problems/subsets-ii/

import java.util.*;

public class Subset2_90 {

    // TC: O(n * 2^n), faster than 85%
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        double total = Math.pow(2, nums.length);
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        
        for (int i = 0; i < total; i++) {
            List<Integer> ls= new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) != 0) ls.add(nums[j]);
            }
            set.add(ls);
        }
        
        return new ArrayList<>(set);
    }
}