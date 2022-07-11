import LeetCodeQuestions.LeetcodeSearch.Medium.RangeFreqQuery;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[]{3, 4, 5, 3, 2, 67, 12};
        Map<Integer, Integer> map = new HashMap<>(Map.of(1, 2, 4, 5,   6, 7, 8, 9, 22, 35,  52, 100));
        for (int i : map.keySet()) {
            System.out.println(i + " " + map.get(i));
        }



    }
}
