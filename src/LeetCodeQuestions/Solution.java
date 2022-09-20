package LeetCodeQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {


    public static int bucketId(int itemID) {
        int answer = 0;

        while (itemID > 0) {
            int digit = itemID % 10;
            answer = Math.max(digit, answer);
            itemID /= 10;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arrrr = new int[6];
        ArrayList<Integer> arr = new ArrayList<Integer>(arrrr.length);

        String input_from_question = br.readLine();

        int n = input_from_question.charAt(0) - 48;
        int num = input_from_question.charAt(2) - 48;

        int count = 0;
        for (int i = 4; i < input_from_question.length(); i += 2) {
            if (num == input_from_question.charAt(i) - 48) count++;
        }

        System.out.println(n - count);
    }
}