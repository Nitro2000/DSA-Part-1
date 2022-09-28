package LeetCodeQuestions.LeetCodeStrings.Easy;

// Problem num: 555 Reverse Words in a String III
// Link: https://leetcode.com/problems/reverse-words-in-a-string-iii/

public class RevStringIII_555 {

    // TC: O(n), faster than 94%
    public String reverseWords(String s) {
        String[] ar = s.split(" ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = reverse(ar[i]); 
        }
        return String.join(" ",  ar);
    }

    private String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse() + "";
    }
}