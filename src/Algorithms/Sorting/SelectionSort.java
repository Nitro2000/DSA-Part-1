package Algorithms.Sorting;

// This is a sorting algorithm for sorting array's
// This algorithm shift the smallest element to the start of array in each iteration its like selecting a particular element
// than check the min with other ele and swap if chosen elem is largerThat's why it is called as selection sort (selecting)
// TC: Best case Omega(n^2), Average case Theta(n^2), Worst case O(n^2)

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] ar) {
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] > ar[j]) swap(ar, i, j);
            }
        }
    }

    private static void swap(int[] ar, int a, int b) {
        int temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
    }
}
