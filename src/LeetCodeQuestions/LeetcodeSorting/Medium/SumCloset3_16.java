package LeetCodeQuestions.LeetcodeSorting.Medium;

// Problem num: 16 3Sum Closest
// Link: https://leetcode.com/problems/3sum-closest/

import java.util.Arrays;

public class SumCloset3_16 {

    // TC: O(n^2), faster than 80%
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        int start;
        int end;
        int sum;
        int min = Integer.MAX_VALUE;
        int ans = 0;
        

        
        for (int i = 0; i < nums.length - 2; i++) {
            
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            start = i + 1;
            end = nums.length - 1;
            
            while (start < end) {
                sum = nums[i] + nums[start] + nums[end];
                
                if (Math.abs(sum - target) < min) {
                    ans = sum;
                    min = Math.abs(sum - target);
                }
                if (min == 0) return sum;
                else if (sum < target) start++;
                else end--;
            }
        }
        return ans;
    }
}