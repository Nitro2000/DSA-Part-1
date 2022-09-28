package LeetCodeQuestions.LeetCodeArray.Medium;

// Problem num: 2410 Maximum Matching of Players With Trainers
// Link: https://leetcode.com/problems/maximum-matching-of-players-with-trainers/

import java.util.Arrays;

public class MaxMatchPlyr_2410 {

    // TC : O(nlogn), fater than 64%
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        
        Arrays.sort(players);
        Arrays.sort(trainers);
        
        int i = players.length - 1;
        int j = trainers.length - 1;
        
        int ans = 0;
        while (i >= 0 && j >= 0) {
            
            if (players[i] <= trainers[j]) {
                ans++;
                i--;
                j--;
            } else {
                i--;
            }
            
        }
        
        return ans;
    }
}