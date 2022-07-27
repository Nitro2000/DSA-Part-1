package Algorithms.Sorting;

// This is a sorting algorithm for sorting array's
// This algorithm makes a sorted array and insert elements in its correct position in the sorted array consider in each iteration,
// That's why it is called as insertion sort
// TC: Best case complexity is O(n), Worst case O(n^2)


import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] ar) {
        for (int i = 1; i < ar.length; i++) {
            int j = i - 1;
            int k = i;
            while (j >= 0 && ar[j] > ar[k]) {
                swap(ar, j, k);
                k = j;
                j--;
            }
        }
    }

    private static void swap(int[] ar, int a, int b) {
        int temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
    }
}
