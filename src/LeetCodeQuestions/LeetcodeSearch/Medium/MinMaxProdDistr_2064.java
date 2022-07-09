package LeetCodeQuestions.LeetcodeSearch.Medium;

/*
Problem num: 2064 Minimized Maximum of Products Distributed to Any Store
Link: https://leetcode.com/problems/minimized-maximum-of-products-distributed-to-any-store/
 */
public class MinMaxProdDistr_2064 {

    // TC: O(mlog(sum)) or O(mlog(max)) => m = quantities.length, fater than 5%, logic is same only sum replace with max
    public int minimizedMaximum(int n, int[] quantities) {
        long sum = 0;
        for (int i : quantities) {
            sum += i;
        }
        if (sum <= n) return 1;
        else {

            long start = 1;
            long end = sum;
            long ans = Integer.MAX_VALUE;
            while (start <= end) {
                long mid = start + (end - start) / 2;
                long validCount  = 0;
                for (int i : quantities) {
                    validCount += i / mid;
                    if (i % mid > 0) validCount++;
                }
                if (validCount <= n) {
                    ans = Math.min(ans, mid);
                    end = mid - 1;
                } else start = mid + 1;
            }
            return (int) ans;

        }

    }
}
