import java.util.*;

class Solution {
    public List<Integer> grayCode(int n) {
        return graySeq(n, 0, new ArrayList<Integer>() {
            {
                add(0);
            }
        });
    }

    private List<Integer> graySeq(int n, int prev, List<Integer> result) {

        if (result.size() == Math.pow(2, n)) return result;

        for (int i = 1; i < Math.pow(2, n); i++) {

            if (check(prev, i, n, result)) {
                result.add(i);
                List<Integer> ans = graySeq(n, i, result);
                if (ans.size() == Math.pow(2, n)) return ans;
                result.remove((Integer) i);
            }
        }
        return result;
    }

    private boolean check(int prev, int next, int length, List<Integer> result) {

        if (result.contains(next)) return false;
        if (result.size() == Math.pow(2, length) - 1) {
            int a = (int) (Math.log(next) / Math.log(2));
            if (next != (1 << a)) return false;
        }

        int count = 0;
        while (length-- != 0) {
            if ((prev & 1) != (next & 1)) {
                count++;
            }
            prev >>= 1;
            next >>= 1;
        }

        return count == 1;
    }
}