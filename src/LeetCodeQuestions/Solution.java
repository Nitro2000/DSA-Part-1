package LeetCodeQuestions;

import java.util.Arrays;

class Solution {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        Arrays.sort(buses);
        Arrays.sort(passengers);


        int start = 0;

        int last = binaryMin(passengers, 0, passengers.length - 1, buses[0], capacity);



        for (int i = 1; i < buses.length; i++) {
            start = last + 1;
            last = binaryMin(passengers, last + 1, passengers.length - 1, buses[i], capacity);
        }



        if (last - start + 1 < capacity) {
            return check(true, buses[buses.length - 1], last, passengers);
        } else {
            return check(false, 0, last, passengers);
        }

    }

    private int check(boolean less, int upper,  int last, int[] passenger) {
        int count = less ? upper : passenger[last];

        for (int i = last; i > 0; i--) {
            if (passenger[i] != count) return count;
            else count--;
        }

        return count == passenger[0] ? count - 1 : count;
    }

    private int binaryMin(int[] pass, int start, int end, int target, int capacity) {
        int begin = start;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (pass[mid] > target) end = mid - 1;
            else {
                if (mid - begin + 1 > capacity) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }
        return end;
    }
}