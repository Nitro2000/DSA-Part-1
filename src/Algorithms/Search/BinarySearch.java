package Algorithms.Search;

import java.util.Scanner;

/*
Find target element in an array, "Array must be sorted in any order"

TC: O(log(n)), omega(1), theta lies between 1 and log(n),  SC: theta(1)

Key points to solve:
start index gives us just bigger(just larger) than target
end index gives us just smaller than target
First array is sorted indicates use BS
Start and end cross point is important give various info it gives the closest bigger num than target
Analyse both number and index
 */
public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target number");
        int target = sc.nextInt();
//        System.out.printf("Target found: %s", findTarget(target, arr));
        System.out.printf("Target found: %s", optimalFind(target, arr));
    }

    static boolean findTarget(int target, int[] ar) {
        int start = 0;
        int end = ar.length - 1;
        while (start <= end) {
            int mid = start - (start - end) / 2;
            if (ar[mid] == target) {
                return true;
            } else if (ar[mid] > target) {
                end = mid - 1;
            } else start = mid + 1;
        }
        return false;
    }

    static boolean optimalFind(int target, int[] ar) {
        int diff = ar[ar.length - 1] - ar[0];
        int start = 0;
        int end = ar.length - 1;
        if (diff >= 0) {
            return findTarget(target, ar);
        } else {
            while (start <= end) {
                int mid = start - (start - end) / 2;
                if (ar[mid] == target) {
                    return true;
                } else if (ar[mid] > target) {
                    start = mid + 1;
                } else end = mid - 1;
            }
            return false;
        }
    }

}
