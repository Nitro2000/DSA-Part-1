package Algorithms.Sorting;

// This is a sorting algorithm for sorting array's, but this is not pure sorting algo, as it needs a condition that provided elements
// should be a non-negative integer i.e 0 < ar[i] < n, elements can repeat itself
// This algorithm count num of element place using count to sort the array
// It count's the num of occurence of element, That's why it is called as count sort
// TC: Best case complexity is O(n), Worst case O(n + k) where k is some constant can be ignore.

import java.util.Arrays;
import java.util.Scanner;

public class CountSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = sc.nextInt();
        }
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void countSort(int[] ar) {
        int max = 0;
        for (int i: ar) {
            max = Math.max(i, max);
        }
        int[] tempAr = new int[max + 1];
        for (int i : ar) {
            ++tempAr[i];
        }

        int index = 0;
        for (int i = 0; i < max + 1; i++) {
            while (tempAr[i] != 0) {
                ar[index] = i;
                index++;
                --tempAr[i];
            }

        }
    }
}
