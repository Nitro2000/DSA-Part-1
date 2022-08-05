package LeetCodeQuestions.LeetCodeBitManipulation.Easy;

// Problem num: 1684 Count the Number of Consistent Strings
// Link: https://leetcode.com/problems/count-the-number-of-consistent-strings/

import java.util.*;

public class CountConsString_1684 {

    // TC: O(n*n[i].length), faster than 62%, this is also constant space as allowed only consist of max 26 character
    public int countConsistentStrings(String allowed, String[] words) {
        
        int ans = 0;
        
        Map<Character, Boolean> map = new HashMap<>();
        for (int i = 0; i < allowed.length(); i++) {
            map.put(allowed.charAt(i), true);
        }
        
        for (String i : words) {
            for (int j = 0; j < i.length(); j++) {
                if (!map.getOrDefault(i.charAt(j), false)) {
                    ans--;
                    break;
                }
            }
            ans++;
        }
        return ans;
    }
}