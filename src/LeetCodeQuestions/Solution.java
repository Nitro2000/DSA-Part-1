package LeetCodeQuestions;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int firstHalf = numbers[0];
        int secHalf = numbers[1];
        int start = 0;
        int mid = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            firstHalf = binarySearch(numbers, start, mid - 1, target, mid);
            if (firstHalf != -1) return new int[]{firstHalf + 1, mid + 1};
            else {
                secHalf = binarySearch(numbers, mid + 1, end, target, mid);
                if (secHalf != -1) return new int[]{mid + 1, secHalf + 1};
                else {
                    if (target - numbers[mid] > numbers[mid]) start = mid + 1;
                    else end = mid - 1;
                }
            }
        }
        return new int[]{0,0};
    }
    
    public int binarySearch(int[] ar, int start, int end, int target, int sum) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (sum + ar[mid] == target) return mid;
            else if (sum + ar[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}