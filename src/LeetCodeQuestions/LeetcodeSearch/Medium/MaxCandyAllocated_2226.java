package Search.LeetcodeSearch.Medium;

// Problem num: 2226 Maximum Candies Allocated to K Children
// Link: https://leetcode.com/problems/maximum-candies-allocated-to-k-children/

public class MaxCandyAllocated_2226 {

    // TC: O(candies.length + candies.length*log(sum(candies)) = O(n(log(sum(array)))), faster than 40%
    public int maximumCandies(int[] candies, long k) {
        long sum = 0;
        for (int i : candies) {
            sum += i;
        }
        return findMaxCandies(candies, k, sum);


    }

    public int findMaxCandies(int[] candies, long k, long sum) {
        long start = 1;
        long end = sum;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * k > sum) end = mid - 1;
            else {
                long count = 0;
                for (int i : candies) {
                    count += i / mid;
                }
                if (count >= k) start = mid + 1;
                else end = mid - 1;
            }
        }
        return (int) end;
    }
}
