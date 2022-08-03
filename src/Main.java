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

        int[] arr = {4, 5, 3, 1, 7, 3};
        arr[1] = arr[1]*-1;
        arr[3] = arr[3]*-1;
        arr[5] = arr[4]*-1;
        System.out.println(Arrays.toString(arr));




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
