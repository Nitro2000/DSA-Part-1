package LeetCodeQuestions.LeetcodeSearch.Easy;

// Problem num 744: Find Smallest Letter Greater Than Target
// Link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class SmallestLetterGreaterThanTarget_744 {

    // TC: O(log(n)) faster than 100%
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] > target) {
                end = mid - 1;
            } else start = mid + 1;
        }
        return start < letters.length ? letters[start] : letters[0];
    }
}
