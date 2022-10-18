package LeetCodeQuestions;

import java.util.*;

class Solution {

    public static void main(String[] args) {
        int[] ar = {1, 2};
        List<Integer> dp = new ArrayList<>(){{
            add(1);
            add(1);
            add(1);
            add(1);
            add(1);
        }}; // only contains count of a, e, i, o, u in particular index
        Character[] vowel = new Character[5];
        vowel[0] = 'a';
        vowel[1] = 'e';
        vowel[2] = 'i';
        vowel[3] = 'o';
        vowel[4] = 'u';

//        List<Character> dp = Arrays.asList(vowel);

        int[] a = ar.clone();
        a[0] = 4;
        Map<Integer, List<Integer>> ab = new HashMap<>();
        ab.put(1, List.of(1, 2, 3));
        ab.put(1, List.of(4, 3, 5));
        System.out.println(ab);
        System.out.println(Arrays.toString(ar) + " " + Arrays.toString(a));
    }

    public int distributeCookies(int[] cookies, int k) {
        List<List<Integer>>[][] dp = new ArrayList[k + 1][cookies.length + 1];

        dp[2][2] = List.of(new ArrayList<>(cookies[0]), new ArrayList<>(cookies[1]));

        for (int i = 2; i < k; i++) {
            for (int j = 3; j < cookies.length; j++) {
                dp[i][j] = new ArrayList<>();

                if (i > 2) {

                } else {
                    for (int l = 0; l < dp[i][j - 1].size(); l++) {
                        dp[i][j - 1].get(l).add(cookies[j]);
                        dp[i][j].add(dp[i][j - 1].get(l));
                    }
                }

            }

        }


        return 0;
    }
}