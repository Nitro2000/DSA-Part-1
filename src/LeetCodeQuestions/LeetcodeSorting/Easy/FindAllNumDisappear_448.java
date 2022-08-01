package LeetCodeQuestions.LeetcodeSorting.Easy;

// Problem num: 448 Find All Numbers Disappeared in an Array
// Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class FindAllNumDisappear_448 {

    // TC: O(n), faster than 84% uses cycle sort in a range
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            if (nums[nums[i] - 1] != nums[i]) swap(nums, i, nums[i] - 1);
            else i++;
        }

        List<Integer> ls = new ArrayList<>();
        for (i = 0; i < nums.length; i++) {
            if (nums[i] - 1 != i) ls.add(i + 1);
        }
        return ls;
    }

    private void swap(int[] ar, int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}
