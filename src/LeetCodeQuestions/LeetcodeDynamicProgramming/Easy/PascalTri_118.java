package LeetCodeQuestions.LeetcodeDynamicProgramming.Easy;

// Problem num: 118 Pascal's Triangle
// Link: https://leetcode.com/problems/pascals-triangle/

import java.util.*;
public class PascalTri_118 {

    // TC: O(n^2), faster than 73%
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lss = new ArrayList<>();
    
        lss.add(new ArrayList<>() {
            {
                add(1);
            }
        });
        
        for (int i = 1; i < numRows; i++) {
            List<Integer> ls = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                int ans = 0;
                if (j - 1 >= 0) ans = lss.get(i - 1).get(j - 1);
                if (j < lss.get(i - 1).size()) ans += lss.get(i - 1).get(j);
                ls.add(ans);
            }
            lss.add(ls);
        }
        return lss;
            
    }
    
}