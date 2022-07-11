package LeetCodeQuestions.LeetcodeSearch.Medium;

// Problem num: 1011 Capacity To Ship Packages Within D Days
// Link: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

public class ShipPackageInNDays_1011 {

    // TC: O(n + nlog(sum)) = O(nlog(sum)), faster than 68%
    public int shipWithinDays(int[] weights, int days) {
        int start = 0;
        int end = 0;
        for (int i : weights) {
            start = Math.max(start, i);
            end += i;
        }


        while (start <= end) {
            int mid = start + (end - start) / 2;
            int count = getCount(weights, mid);

            if (count > days) start = mid + 1;
            else end = mid - 1;
        }
        return start;
    }

    private int getCount(int[] weights, int mid) {
        int subSum = 0;
        int count = 1;
        for (int weight : weights) {
            subSum += weight;
            if (subSum > mid) {
                count++;
                subSum = weight;
            }
        }
        return count;
    }
}
