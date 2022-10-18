package LeetCodeQuestions.LeetcodeDynamicProgramming.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumEqualK {

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        int sum = sc.nextInt();

        // constraint  1 < n[i] < 100
        //   1 < n < 200

        int[][] dp = new int[ar.length + 1][20000];

        System.out.println(checkAns(ar, 0, 0, sum, dp, ""));
    }

    // [1, 3, 4, 5, 2, 5], sum = 19,  ans (5, 5, 1) (4, 5, 2)
    private static boolean checkAns(int[] ar, int ind, int currSum, int sum, int[][] dp, String print) {

        if (currSum == sum) {
            System.out.println(print);
            return true;
        }
        if (ind == ar.length) return false;

        boolean taken = false;
        boolean notTaken = false;

        if (dp[ind][currSum] != 0) return dp[ind][currSum] == 1;

        notTaken = checkAns(ar, ind + 1, currSum, sum, dp, print);

        taken = checkAns(ar, ind + 1, currSum + ar[ind], sum, dp, print + ar[ind] + " ");

        boolean ans = taken || notTaken;

        dp[ind][currSum] = ans ? 1 : 2;
        return ans;

    }

}
