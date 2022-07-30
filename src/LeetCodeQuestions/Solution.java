package LeetCodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);

        List<List<Integer>> ls = new ArrayList<>();


        int mini = 10000000;
        for (int i = 0; i < arr.length - 1; i++) {
            mini = Math.min(mini, Math.abs(arr[i] - arr[i + 1]));
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i] - arr[i + 1]) == mini) {
                List<Integer> lss = new ArrayList<>();
                lss.add(2);
                lss.add(3);
                ls.add(lss);
            }
        }
        return ls;


    }
}