package LeetCodeQuestions.LeetcodeDynamicProgramming.Medium;

// Problem num: 2110 Number of Smooth Descent Periods of a Stock
// Link: https://leetcode.com/problems/number-of-smooth-descent-periods-of-a-stock/

public class NumSmoothDesStock_2110 {

    // TC: O(n), faster than 100%
    public long getDescentPeriods(int[] prices) {
        return getDesTab(prices);
    }
    
    private long getDesTab(int[] prices) {
        long dpVal = 1;
        long dpLong = 1;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] - prices[i] == 1) {
                dpVal += 1 + dpLong;
                dpLong++;
            } else {
                dpVal += 1;
                dpLong = 1;
            }
        }
        
        return dpVal;
    }
}
