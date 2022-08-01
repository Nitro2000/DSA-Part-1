package LeetCodeQuestions.LeetcodeSorting.Easy;

// Problem num: 1 Two Sum
// Link: https://leetcode.com/problems/two-sum/

import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {

    // TC: O(n), faster than 77%, Its best TC
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) map.put(nums[i], i);

        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];
            if (map.getOrDefault(rem, -1) != -1 && map.get(rem) != i) {
                return new int[]{i, map.get(rem)};
            }
        }
        return new int[]{};
    }
}
