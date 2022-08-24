package LeetCodeQuestions.LeetcodeDynamicProgramming.Easy;

// Problem num: 119 Pascal's Triangle II
// Link: https://leetcode.com/problems/pascals-triangle-ii/

import java.util.*;
public class PascalTri2_119 {

    // TC: O(n), faster than 92%;
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            int next = (int) ((long) ls.get(i - 1) * (rowIndex - i + 1) / i);
            
            ls.add(next);
        }
        return ls;
    }
}