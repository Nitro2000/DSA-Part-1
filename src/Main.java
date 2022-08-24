import LeetCodeQuestions.LeetcodeSearch.Medium.RangeFreqQuery;

import java.lang.reflect.Array;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import java.util.*;
public class Main  {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        int[] ar = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
            map.put(ar[i], map.getOrDefault(ar[i], 0) + 1);
        }

        int count = 0;
        for (int i : ar) {
            map.put(i, map.get(i) - 1);
            if (map.getOrDefault(t - i, 0) != 0) count++;
        }
        System.out.println(count);

    }

    private static int[] solve(String[] a, String[] b) {
        Map<Character, Integer> map = new HashMap<>();
        int[] ar = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length(); j++) {
                char c = a[i].charAt(j);
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            int count = 0;
            for (int j = 0; j < b[i].length(); j++) {
                if (b[i].length() != a[i].length()) {
                    count = -1;
                    break;
                }
                char ch = b[i].charAt(j);
                if(map.getOrDefault(ch, 0) == 0) count++;
            }
            ar[i] = count;
        }
        return ar;
    }
}
