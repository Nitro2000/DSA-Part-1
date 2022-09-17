package LeetCodeQuestions.LeetcodeDynamicProgramming.Medium;

// Problem num: 2380 Time Needed to Rearrange a Binary String
// Link: https://leetcode.com/problems/time-needed-to-rearrange-a-binary-string/

public class secToRemOcc_2380 {

    // TC: O(n), faster than 18%
    public static int secondsToRemoveOccurrences(String s) {
        boolean pres;
        int count = 0;
        while (true) {
            pres = false;
            StringBuilder ans = new StringBuilder();
            int i = 0;
            while (i < s.length() - 1) {
                char curr = s.charAt(i);
                char next = s.charAt(i + 1);
                if (curr == '0' && next == '1') {
                    ans.append("10");
                    pres = true;
                    i += 2;
                } else {
                    ans.append(curr);
                    i++;
                }
            }
            if (!(i == s.length())) ans.append(s.charAt(s.length() - 1));
            if (!pres) break;
            count++;
            System.out.println(s + " " + ans);
            s = ans.toString();
        }

        return count;
    }
}