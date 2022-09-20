package LeetCodeQuestions.LeetcodeDynamicProgramming.Medium;

// Problem num: 2310. Sum of Numbers With Units Digit K
// Link: https://leetcode.com/problems/sum-of-numbers-with-units-digit-k/

public class SumNumUnitDigit_2310 {

    // TC: O(n) faster than 8%, u can optimise as well by not finding array directly implement value
    public int minimumNumbers(int num, int k) {
        int size = num / 10;
        
        if (num % 10 >= k) {
            if (k != 0) size++;
            else if (num >= 10) {
                k = 10;
                size++;  
            }              
        }
        
        int[] ar = new int[size];
        
        for (int i = 0; i < size; i++) {
            ar[i] = k;
            k += 10;
        }
        
        int[][] dp = new int[num + 1][ar.length + 1];   

        int ans = minNumMemo(ar, num, 0, 0, dp);
        return ans == Integer.MAX_VALUE? -1 : ans;
    }
    
    private int minNumMemo(int[] ar, int n, int count, int index, int[][] dp) {
        if (n == 0) return count;
        
        if (n < 0 || index == ar.length) return Integer.MAX_VALUE;
        
        if (dp[n][index] != 0) return dp[n][index];
        
        int ifTaken = minNumMemo(ar, n - ar[index], count + 1, index, dp);
        int ifLeft = minNumMemo(ar, n, count, index + 1, dp);
        
        return dp[n][index] = Math.min(ifTaken, ifLeft);
        // You can remove variable as well but its about to be more clear as well, if u think about line 11 then it is readable easily not a very huge line 
        
    }
}