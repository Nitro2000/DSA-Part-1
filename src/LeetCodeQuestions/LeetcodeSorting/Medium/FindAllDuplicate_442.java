package LeetCodeQuestions.LeetcodeSorting.Medium;

// Problem num: 442. Find All Duplicates in an Array
// Link: https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.*;

public class FindAllDuplicate_442 {

    // TC: O(n), faster than 99%, you can use cycle sort in a range concept as well
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ls = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i++){
            
            int ele = Math.abs(nums[i])-1;
            
            if(nums[ele] > 0) {
                nums[ele] = nums[ele] * (-1);
            }
            else ls.add(ele + 1);
            
        }
        return ls;
    }
}