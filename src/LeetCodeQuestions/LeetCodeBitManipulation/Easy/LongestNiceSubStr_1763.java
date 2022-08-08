package LeetCodeQuestions.LeetCodeBitManipulation.Easy;

// Problem num: 1763 Longest Nice Substring
// Link: https://leetcode.com/problems/longest-nice-substring/

import java.util.HashSet;
import java.util.Set;

public class LongestNiceSubStr_1763 {

    // TC: O(2^n), faster than 75%
    public String longestNiceSubstring(String s) {
        if(s.length() <=1)
            return "";
        Set<Character> set = new HashSet();
        for (int i =0; i< s.length() ; i++){
            set.add(s.charAt(i));
        }
        for(int i = 0; i< s.length() ; i++){
           if(set.contains(Character.toUpperCase(s.charAt(i))) && set.contains(Character.toLowerCase(s.charAt(i)))){
                continue;
            }
            
            String s1 = longestNiceSubstring(s.substring(0,i));
            String s2 = longestNiceSubstring(s.substring(i+1));
            
            return s1.length()>=s2.length() ? s1 : s2;
        }
        
        return s;
    }
}