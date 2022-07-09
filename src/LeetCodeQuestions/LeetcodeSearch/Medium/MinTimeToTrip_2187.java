package LeetCodeQuestions.LeetcodeSearch.Medium;

// Problem num: 2187 Minimum Time to Complete Trips
// Link: https://leetcode.com/problems/minimum-time-to-complete-trips/

public class MinTimeToTrip_2187 {

    // TC: O(time.length + log(max * totalTrips) * time.length) = O(nlog(k)) faster than 55% java submission
    public long minimumTime(int[] time, int totalTrips) {
        long start = 1;
        long mid = 0;
        long max = 0;
        long count = 0;
        for (int i: time)
            max = Math.max(max, i);

        long end = max * totalTrips;

        while (start <= end) {
            mid = start + (end - start) / 2;
            count = 0;
            for (int i : time) {
                count += mid / i;
            }
            if (count < totalTrips) start = mid + 1;
            else end = mid - 1;
        }

        return start;
    }

}
