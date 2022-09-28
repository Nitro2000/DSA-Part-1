package LeetCodeQuestions.LeetcodeDynamicProgramming.Medium;

// Problem num: 2305 Fair Distribution of Cookies
// Link https://leetcode.com/problems/fair-distribution-of-cookies/

public class FairDistCook_2305 {
    
    private int ans = Integer.MAX_VALUE;

    // TC: O(n2) , faster than 50%
    public int distributeCookies(int[] cookies, int k) {
        recursion(cookies, k, 0, new int[k]);
        return ans;
    }
    
    private void recursion(int[] cookies, int k, int index, int[] bagValue) {
        if (index == cookies.length) {
            int max = 0;
            for (int i : bagValue) {
                max = Math.max(i, max);
            }
            ans = Math.min(max, ans);
            return;
        }
        
        
        
        for (int i = 0; i < k; i++) {
            bagValue[i] += cookies[index];
            recursion(cookies, k, index + 1, bagValue);
            bagValue[i] -= cookies[index];
        }
    }
}