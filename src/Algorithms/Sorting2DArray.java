package Algorithms;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting2DArray {
    public void sort2D(int[][] ar, int column) {
        Arrays.sort(ar, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int ans = comparison(o1[column], o2[column]);
                if (ans == 0) {
                    return comparison(o1[column + 1], o2[column + 1]);
                }
                return ans;
            }
        });
    }

    public int comparison(int a, int b) {
        return Integer.compare(a, b);
    }

    // Second method to sort 2D array
    public void sortCompChain(int[][] ar, int columnNum) {
        Arrays.sort(ar, Comparator.comparingInt((int[] a) -> a[columnNum]).thenComparingInt(a -> a[columnNum + 1]));
    }

    public void sortLambda(int[][] ar, int columnNum) {
        Arrays.sort(ar, (a, b) -> {
            int ans = a[columnNum] - b[columnNum];
            if (ans == 0) ans = a[columnNum + 1] - b[columnNum + 1];
            return ans;
        });
    }
}
