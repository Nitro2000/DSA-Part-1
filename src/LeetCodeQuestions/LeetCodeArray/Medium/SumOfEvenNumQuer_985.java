package LeetCodeQuestions.LeetCodeArray.Medium;

// Problem num: 985 Sum of Even Numbers After Queries
// Link: https://android-developers.googleblog.com/

public class SumOfEvenNumQuer_985 {

    // TC: O(n), faster than 20%;
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] ar = new int[nums.length];
        int evenSum = 0;
        
        for (int i : nums) {
            if (i % 2 == 0) evenSum += i;
        }
        
        for (int i = 0; i < nums.length; i++) {
            int index = queries[i][1];
            if (nums[index] % 2 == 0) {
                evenSum -= nums[index];               
            } 
            nums[index] = nums[index] + queries[i][0];
            
            if (nums[index] % 2 == 0) evenSum += nums[index];
            ar[i] = evenSum;
        }
        
        return ar;
    }
}