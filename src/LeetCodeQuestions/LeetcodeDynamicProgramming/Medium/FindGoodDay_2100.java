package LeetCodeQuestions.LeetcodeDynamicProgramming.Medium;

// Problem num: 2100 Find Good Days to Rob the Bank
// Link: https://leetcode.com/problems/find-good-days-to-rob-the-bank/

import java.util.ArrayList;
import java.util.List;

public class FindGoodDay_2100 {

    // TC: O(n), faster than 100%
    public List<Integer> goodDaysToRobBank(int[] sec, int time) {

        List<Integer> list = new ArrayList<>();

        // For exception case of 0
        if (time == 0) {
            for (int i = 0; i < sec.length; i++) {
                list.add(i);
            }
            return list;
        }

        // Declare when needed first assume that you have all variable needed
        int prev = 0;
        int next = 0;
        boolean flag = false;
        int pnext = 0;
        
        
        for (int i = 0; i < sec.length - time - 1; i++) {
            
            if (sec[i] >= sec[i + 1]) {
                prev++;
                
                if (prev == time) {
                    
                    // For next already calculated and in seq as needed
                    if (flag) {
                        if (sec[i + 1 + time] >= pnext) {
                            next++;
                        }
                    } else {
                        // Run if flag is false, means next time elements from i + 1, was not in seq that's why flag is false
                        for (int j = i + 1; j < i + 1 + time; j++) {
                            if (sec[j] <= sec[j + 1]) {
                                next++;
                            } else {
                                next = 0;
                                break;
                            }
                        }
                    }
                    // If found right index
                    if (next == time) {
                        flag = true;
                        pnext = sec[i + 1 + time]; // Storing last next value pnext(previous next) for new next element as flag is true and we don't want to run loop
                        list.add(i + 1);
                        // Found then reduce to check upcoming value, i.e maintaining prev and next
                        prev--;
                        next--;
                    } else {
                        // This else if prev time elem are wrong than setting variable again
                        flag = false;
                        prev--;
                        next = 0;
                    }
                } 
            } else {
                flag = false;
                prev = 0;
                next = 0;
            }
        }
        return list;
    }
}