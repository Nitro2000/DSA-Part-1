import LeetCodeQuestions.LeetcodeSearch.Medium.RangeFreqQuery;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
interface hello {
    public void hel();
}

public class Main  {

    public static CyclicBarrier barrier = new CyclicBarrier(3);

    public static void main(String[] args)         throws InterruptedException
    {
        hello h = new hello() {
            @Override
            public void hel() {
                System.out.println(2);
            }
        };
        h.hel();

    }
}
