package LeetCodeQuestions.LeetcodeSorting.Medium;

// Problem num: 15 3Sum
// Link: https://leetcode.com/problems/3sum/

import java.util.*;

public class Sum3_15 {

    // TC: O(nlog(n) + n^2) = O(n^2), faster than 68%, SC: O(n), faster than 95%
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();

        int start;
        int end;
        int sum;

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            start = i + 1;
            end = nums.length - 1;

            while (start < end) {
                sum = nums[i] + nums[start] + nums[end];

                if (sum == 0) {
                    List<Integer> lss = new ArrayList<>();
                    lss.add(nums[i]);
                    lss.add(nums[start]);
                    lss.add(nums[end]);
                    set.add(lss);
                    end--;
                    start++;
                } else if (sum > 0) end--;
                else start++;
            }
        }

        return new ArrayList<>(set);
    }
}
