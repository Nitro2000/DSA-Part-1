package LeetCodeQuestions.LeetcodeSorting.Easy;

// Problem num: 1608. Special Array With X Elements Greater Than or Equal X
// Link: https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/

public class SpecialArrayWithX_1608 {

    // TC: O(n), using sorting, faster than 90%, can also be done by binary search TC will be O(nlog(n))
    public int specialArray(int[] nums) {
        // There can be two solution of this.
        /*
            Binary Search : We can make a range where x lies it should be less than max or length
            which will be the min between two and then search, takes (nlog(n)) time,  log(n) for search and
            n for each time loop check.

            Sorting: As num are positive we can sort with counting sort takes O(n), then simple checking
            by curr element and remaining length as shown below. This should be faster but both have same time
            according to submission
        */

        // Using binary search
//         int start = 1;
//         int end = nums.length;
//         while (start <= end) {
//             int mid = start + (end - start) / 2;

//             int count = 0;
//             for (int i : nums) if (i >= mid) count++;

//             if (count > mid) start = mid + 1;
//             else if (count == mid) return mid;
//             else end = mid - 1;
//         }

//         return -1;

        // Using sorting
        countingSort(nums);
        int prev = 0;
        for (int i = 0; i < nums.length; i++) {
            int remLeng = nums.length - i; // including element count
            if (remLeng <= nums[i] && remLeng > prev) return remLeng;
            prev = nums[i];
        }
        return -1;
    }

    private void countingSort(int[] ar) {

        int max = 0;
        for (int i : ar) max = Math.max(max, i);

        int[] count = new int[max + 1];
        for (int i : ar) ++count[i];

        int i = 0;
        int j = 0;
        while (i < count.length) { // length here is max + 1
            if (count[i] != 0) {
                ar[j] = i;
                j++;
                --count[i];
            } else i++;
        }
    }


}
