package LeetCodeQuestions.LeetcodeSorting.Easy;

// Problem num: 1502 Can Make Arithmetic Progression From Sequence
// Link: https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/

import java.util.Arrays;

public class CanMakeAPFromSeq_1502 {

    // TC: O(nlog(n)) due to sorting, faster than 75%, can decrease to O(n) using set contains
    public boolean canMakeArithmeticProgression(int[] arr) {

        Arrays.sort(arr);

        int diff = arr[1] - arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + diff != arr[i + 1]) return false;
        }

        return true;

    }
}
