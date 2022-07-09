package Search;

import java.util.Arrays;
import java.util.Scanner;

// Finding a target element in an array
// Time complexity (TC) : O(n), omega(1) theta can't define as TC varies, Space complexity (SC) : theta(1), O(1), omega(1)
public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target number");
        int target = sc.nextInt();
        System.out.printf("Target found: %s", findTarget(target, arr));
    }

    static boolean findTarget(int target, int[] ar) {
        for (int j : ar) {
            if (target == j) return true;
        }
        return false;
    }
}
