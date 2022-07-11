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
    public void sort(int[][] ar, int columnNum) {
        Arrays.sort(ar, (a, b) -> a[columnNum] - b[columnNum]);
    }
}
