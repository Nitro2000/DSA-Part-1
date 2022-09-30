package LeetCodeQuestions.LeetcodeDynamicProgramming.Medium;

// Problem num: 2063 Vowels of All Substrings
// Link: https://leetcode.com/problems/vowels-of-all-substrings/

import java.util.HashSet;
import java.util.Set;

// Logic find for ith character ans value from prev ans and curr ans length will be i + 1 always
public class VowelsAllSubStr_2063 {

    // TC: O(n), faster than 80%, but i guess it should be 100%
    public long countVowels(String word) {
        return countTab(word);
    }
    
    private long countTab(String word) {
        
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        
        long ans = 0;
        long prevAns = 0;
        // long currAns = 0;
        
        for (int i = 0; i < word.length(); i++) {
                        
            if (set.contains(word.charAt(i))) {
                prevAns += i + 1;
            }
            // currAns++;
            // currAns += i + prevAns;
            // else currAns += prevAns;
            
            ans += prevAns;
        }
        return ans;
    }
    
}