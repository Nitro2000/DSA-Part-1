package LeetCodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Solution {

    public int distributeCookies(int[] cookies, int k) {
        List<List<Integer>>[][] dp = new ArrayList[k + 1][cookies.length + 1];

        dp[2][2] = List.of(new ArrayList<>(cookies[0]), new ArrayList<>(cookies[1]));

        for (int i = 2; i < k; i++) {
            for (int j = 3; j < cookies.length; j++) {
                dp[i][j] = new ArrayList<>();

                if (i > 2) {

                } else {
                    for (int l = 0; l < dp[i][j - 1].size(); l++) {
                        dp[i][j - 1].get(l).add(cookies[j]);
                        dp[i][j].add(dp[i][j - 1].get(l));
                    }
                }

            }

        }


        return 0;
    }
}