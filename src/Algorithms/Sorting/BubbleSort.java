package Algorithms.Sorting;

// This is a sorting algorithm for sorting array's
// This algorithm shift the largest element to the end of array in each iteration, like a bubble to top of water
// That's why it is called as bubble sort
// TC: Best case complexity is O(n), Worst case O(n^2)

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] ar) {
        boolean swapped;
        for (int i = 0; i < ar.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < ar.length - i - 1; j++) { // as each time largest get reach to its correct position
                if (ar[j] > ar[j + 1]) {
                    swap(ar, j,  j+ 1);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        String s  = Arrays.toString(ar);
    }

    private static void swap(int[] ar, int a, int b) {
        int temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
    }

}
