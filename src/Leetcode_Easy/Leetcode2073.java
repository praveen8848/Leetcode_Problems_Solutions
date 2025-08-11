package Leetcode_Easy;

import java.util.ArrayDeque;
import java.util.Queue;

public class Leetcode2073 {
    public static void main(String[] args) {
        int[] tickets = {5,1,1,1};
        int k = 0;
        int ans = counttime(tickets,k);
        System.out.println(ans);
    }

    private static int counttime(int[] tickets, int k) {
        Queue<Integer> qt = new ArrayDeque<>();
        for (int i = 0; i < tickets.length; i++) {
            qt.add(i);
        }
        int time = 0;

        while(!qt.isEmpty()){
            int front = qt.poll();
            time++;

            tickets[front]--;

            if(k == front && tickets[front] == 0){
                return time;
            }
             if(tickets[front] != 0){
                qt.add(front);
            }
        }
        return  time;
    }
}
