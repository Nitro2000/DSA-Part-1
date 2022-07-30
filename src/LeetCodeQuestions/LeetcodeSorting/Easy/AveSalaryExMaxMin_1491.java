package LeetCodeQuestions.LeetcodeSorting.Easy;

// Problem num: 1491 Average Salary Excluding the Minimum and Maximum Salary
// Link: https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/

public class AveSalaryExMaxMin_1491 {

    // TC: O(n), faster than 100%
    public double average(int[] salary) {

        int max = 0;
        int min = 1000001;
        double sum = 0.00;

        for (int i : salary) {
            max = Math.max(max, i);
            min = Math.min(min, i);
            sum += i;
        }

        sum -= max + min;

        return sum / (salary.length - 2);
    }
}
