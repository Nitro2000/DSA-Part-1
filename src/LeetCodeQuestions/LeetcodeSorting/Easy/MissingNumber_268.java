package LeetCodeQuestions.LeetcodeSorting.Easy;

// Problem num: 268 Missing number
// Link: 

public class MissingNumber {

    public int missingNumber(int[] nums) {
        // We can do this by many methods like bit (XOR), sum(n) - sum(given), cycle sort
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i && nums[i] != nums.length) swap(nums, i, nums[i]);
            else i++;
        }
        i = 0;
        while (i < nums.length) {
            if(nums[i] != i) return i;
            else i++;
        }
        return nums.length;

        // Another solution
        // int sum = 0;
        // for (int i : nums) {
        //     sum += i;
        // }
        // return (nums.length + 1) * (nums.length) / 2 - sum;

    }

    private void swap(int[] ar, int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}
