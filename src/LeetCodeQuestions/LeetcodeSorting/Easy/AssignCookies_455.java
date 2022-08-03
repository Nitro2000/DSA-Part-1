package LeetCodeQuestions.LeetcodeSorting.Easy;

// Problem num: 455 Assign Cookies
// Link: https://leetcode.com/problems/assign-cookies/


import java.util.Arrays;

public class AssignCookies_455 {

    // TC: O(nlog(n), faster than 70%
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;
        int ans = 0;

        while (i < g.length) {
            if (j == s.length) break;
            else if (g[i] <= s[j]) {
                ans++;
                i++;
                j++;
            } else j++;
        }
        return ans;
    }
}
