package LeetCodeQuestions.LeetcodeSorting.Medium;

// Problem num: 75 Sort Colors
// Link: https://leetcode.com/problems/sort-colors/

public class SortColors_75 {
    public void sortColors(int[] nums) {
        
        int zero = 0;
        int one = 0;

        for (int i : nums) {
            if (i == 0) zero++;
            else if (i == 1) one++;

        }
        
        for (int i = 0; i < nums.length; i++) {
            if (zero != 0) {
                nums[i] = 0;
                zero--;
            } else if (one != 0) {
                nums[i] = 1;
                one--;
            } else nums[i] = 2;
        }
        
    }
}