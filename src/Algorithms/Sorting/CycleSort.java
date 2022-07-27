package Algorithms.Sorting;

// This is a sorting algorithm for sorting array's, but this is not pure sorting algo, as it needs a condition that provided elements
// should be a non-negative integer i.e 0 < ar[i] < n or 1 < ar[i] < n, and in continuous with in range. if not continuous than ignore duplicate element
// element should be unique, can be duplicate then we have to put an if else and swap if at original there is already the correct ele then no swap else swap
// This algorithm find element for its correct position and place to sort the array
// It cycle's the next element till correct element found, That's why it is called as cycle sort
// TC: Best case complexity is O(n), Worst case O(n + k) where k is some constant can be ignore.

// Question trick: When array element aree given in range from 0 to n or 1 to n, apply cycle sort
//

import java.util.Arrays;
import java.util.Scanner;

public class CycleSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = sc.nextInt();
        }
        cycleSort1(arr);
        System.out.println(Arrays.toString(arr));
    }


    // for range 0 < ar[i] < n, TC: O(n)
    private static void cycleSort1(int[] ar) {
        int i = 0;
        while (i < ar.length - 1) {
            if (i == ar[i]) i++;
            else swap(ar, i, ar[i]);
        }
    }

    // Elements can be negative, zero, but TC: O(n^2)
    // We iterate element and than find how much elements are smaller than that and place accordingly
    private static void cycleSort2(int[] arr) {
        int i = 0;
        int pos = 0;
        if (arr.length == 0) return;
        int ele = arr[pos];
        while(i < arr.length - 1) {
            int temp;
            for (int j : arr) {
                if (j < ele) {
                    pos++;
                }
            }
            if (i == pos) {
                arr[pos] = ele;
                i++;
                ele = arr[i];
            } else {
                temp = arr[pos];
                arr[pos] = ele;
                ele = temp;
            }
            pos = 0;

        }
    }

    private static void swap(int[] ar, int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

}
