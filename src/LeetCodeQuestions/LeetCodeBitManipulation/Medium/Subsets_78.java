package LeetCodeQuestions.LeetCodeBitManipulation.Medium;

// Problem num: 78 Subsets
// Link: https://leetcode.com/problems/subsets/

import java.util.*;

public class Subsets_78 {

    // TC: O(n * 2^n), faster than 100%, using bit manipulation
    public List<List<Integer>> subsets(int[] nums) {
        double noOfSubSet = Math.pow(2, nums.length);
        List<List<Integer>> ls = new ArrayList<>();
        
        for (int i = 0; i < noOfSubSet; i++) {
            List<Integer> lss = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                int ans = i & (1 << j);
                if (ans != 0) lss.add(nums[j]);
            }
            ls.add(lss);
        }
        return ls;
    }
}