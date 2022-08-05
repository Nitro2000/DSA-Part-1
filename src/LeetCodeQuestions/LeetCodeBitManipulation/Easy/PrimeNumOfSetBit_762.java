package LeetCodeQuestions.LeetCodeBitManipulation.Easy;

// Problem num: 762. Prime Number of Set Bits in Binary Representation
// Link: https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/

public class PrimeNumOfSetBit_762 {

    // TC: O(right - left + (no. of bits) ^ 1 /2), faster than 100%
    public int countPrimeSetBits(int left, int right) {
        int sol = 0;
        for (int i = left; i <= right; i++) {
            int ans = i;
            int count = 0;
            while (ans > 0) {
                ans -= ans & -ans;
                count++;
            }
            if (prime(count)) sol++;

        }
        return sol;
    }

    private boolean prime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= (int)Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
