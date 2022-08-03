package LeetCodeQuestions.LeetcodeSorting.Medium;

// Problem num: 18 4Sum
// Link: https://leetcode.com/problems/4sum/

import java.util.*;

public class Sum14_18 {

    // TC: O(n^3), faster than 66%
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        Set<List<Integer>> set = new HashSet<>();
        
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int start = j + 1;
                int end = nums.length - 1;
                
                while (start < end) {
                    long sum = nums[i] + nums[j];
                    sum += nums[start] + nums[end];
                    if (sum == target) {
                        List<Integer> ls = new ArrayList<>();
                        ls.add(nums[i]);
                        ls.add(nums[j]);
                        ls.add(nums[start]);
                        ls.add(nums[end]);
                        set.add(ls);
                        end--;
                        start++;
                    } else if (sum > target) end--;
                    else start++;
                }
            }
        }
        
        return new ArrayList<>(set);
    }
}