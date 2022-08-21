package LeetCodeQuestions.LeetCodeBitManipulation.Medium;

// Problem num: 137 Single Number II
// Link: https://leetcode.com/problems/single-number-ii/

public class SingleNumber2_137 {

    // TC: O(n * log(32)) = O(n), faster than 30%
    public int singleNumber(int[] nums) {
        int[] ar = new int[32];
        int minCount = 0;
        
        for (int i : nums) {
            int index = 0;
            if (i == Integer.MIN_VALUE) minCount++;
            else {
                while (i != 0 && index <= 31) {
                    int a = -i;
                    int ans = i & -i;
                    int position = (int) (Math.log(ans) / Math.log(2));
                    index += position + 1;
                    ar[32 - index] += 1;
                    i = (i >> (position + 1));
                }
            }
            
        }
        if (minCount % 3 != 0) return Integer.MIN_VALUE;
        else {
            int ans = 0;
            int power = 0;
            for (int i = 31; i >= 0; i--) {
                if (ar[i] % 3 == 1) ans += (int) Math.pow(2, power);
                power++;
            }
            return ans < 0 ? ans + 1 : ans;
        }
    }
}