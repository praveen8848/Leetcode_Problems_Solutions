package LeetcodeMedium;

import java.util.Arrays;

public class Leetcode2410 {
    public static void main(String[] args) {
        int[] players = {1,1,1};
        int[] trainers = {10};
        int ans = matching(players, trainers);
        System.out.println(ans);
    }

    private static int matching(int[] players, int[] trainers) {
        int count = 0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int s = 0;
        for (int i = 0; i < trainers.length; i++) {
            while (s<players.length){
                if(players[s]<= trainers[i]){
                    count++;
                    s++;
                }
                break;
            }
        }
        return count;
    }
}
