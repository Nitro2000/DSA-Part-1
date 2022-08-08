package LeetCodeQuestions.LeetCodeBitManipulation.Easy;

// Problem num: 1863 Sum of All Subset XOR Totals
// Link: https://leetcode.com/problems/sum-of-all-subset-xor-totals/

public class SumAllSubSetXorTotal_1863 {

    // TC: O(2^n), faster than 85%
    public int subsetXORSum(int[] nums) {
        int ans = subSet(nums, 0, 0);
        return ans;
        
    }
    
    private int subSet(int[] nums, int ans, int index) {
        if (index == nums.length) {
            return ans;
        }
        
        // Can reduce to one line, But this is more readable
        int sum  = subSet(nums, ans ^ nums[index], index + 1);  
        return sum + subSet(nums, ans, index + 1);
    }
    
}