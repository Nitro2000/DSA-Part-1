import LeetCodeQuestions.LeetcodeSearch.Medium.RangeFreqQuery;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
interface hello {
    public void hel();
}

public class Main  {


    public static void main(String[] args)         throws InterruptedException
    {
        int[] a = {};
        int[] b = {};
        System.out.println(solve(a, b, a.length));
    }

    private static int solve(int[] a, int[] b, int length) {
        int pos = 0;
        int neg = 0;
        Map<Integer, Integer> map = new HashMap<>();

        // logic
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i: b) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i = 0; i < length; i++) {
            if (map.getOrDefault(a[i], 0) != 0) map.put(a[i], map.get(a[i]) - 1);
            else {

            }

        }


        return -1;
    }


}
