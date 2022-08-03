package LeetCodeQuestions.LeetcodeSorting.Easy;

// Problem num: 169 Majority Element
// Link: https://leetcode.com/problems/majority-element/

public class MajorityElement_169 {

    // TC: O(n), faster than 95%
    public int majorityElement(int[] nums) {
        
        int count = 0;
        int prev = 0;
        for (int i : nums) {
            
            if (count == 0) {
                prev = i;
            }
            
            if (prev != i) {
                count--;
            } else count++;
            
        }
        return prev;
    }
}