import LeetCodeQuestions.LeetcodeSearch.Medium.RangeFreqQuery;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
interface hello {
    public void hel();
}

public class Main  {

    public static CyclicBarrier barrier = new CyclicBarrier(3);

    public static void main(String[] args)         throws InterruptedException
    {
        int ans = 0;
        for (int i = 0; i <= 10; i++) {
            ans ^= i;

        }
        System.out.println(ans);



        Map<Integer, Integer> map = new HashMap<>();
        System.out.println(map.put(2, 4));
        System.out.println(map.put(2, 4));
        int[] ar = new int[] {1, 3, 4, 5};
        int[] c = ar.clone();

        ar[1] = 8;

    }
}
