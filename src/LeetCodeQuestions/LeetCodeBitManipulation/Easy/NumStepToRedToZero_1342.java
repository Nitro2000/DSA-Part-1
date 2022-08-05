package LeetCodeQuestions.LeetCodeBitManipulation.Easy;

// Problem num: 1342 Number of Steps to Reduce a Number to Zero
// Link: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class NumStepToRedToZero_1342 {

    // TC: O(log(n)), faster than 71%
    public int numberOfSteps(int num) {
        int count = 0;
        
        while (num > 0) {
            double powerOf2 = Math.log(num) / Math.log(2);
            if ((num & 1) == 1) num = num - 1;  // Checking num odd and minus 1, we can also make num &= 1;
            else if ((int) powerOf2 == powerOf2) return (int) powerOf2 + count + 1;
            else num /= 2;
            count++;
        }
        return count;
    }
}