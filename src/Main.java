import LeetCodeQuestions.LeetcodeSearch.Medium.RangeFreqQuery;

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

        Set<Integer> set = new HashSet<>();
        set.add(23);
        set.add(45);
        set.add(34);
        set.add(34);
        List<Integer> ls = new ArrayList<>();

        for (Integer i : set) {
            ls.add(i);
        }

        set.remove(34);
        System.out.println(set + " " + ls);

        Map<Integer, Integer> map = new HashMap<>();
        System.out.println(map.put(2, 4));
        System.out.println(map.put(2, 4));
        int[] ar = new int[] {1, 3, 4, 5};
        int[] a = {1, 2,3, 4, 5};
        int[] b = a.clone();
        int[] c = ar.clone();

        a[1] = 8;
        ar[1] = 8;
        System.out.println(Arrays.toString(ar) + " " + Arrays.toString(a) + " " + Arrays.toString(b) + " " + Arrays.toString(c));

    }
}
