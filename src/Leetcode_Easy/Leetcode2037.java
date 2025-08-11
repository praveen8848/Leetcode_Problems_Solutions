package Leetcode_Easy;

import java.util.Arrays;

public class Leetcode2037 {
    public static void main(String[] args) {
        int[] seats = {3,1,5};
        int[] students = {2,7,4};
        int ans = minimumMoves(seats,students);
        System.out.println(ans);
    }

    private static int minimumMoves(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int sum = 0;
        for (int i = 0; i < seats.length; i++) {
            sum = sum + Math.abs(seats[i] - students[i]);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(10);
        System.out.println(sb);
        String str = sb.toString();
        int p = Integer.parseInt(str);
        System.out.println(p);
        double power  = Math.pow(2,p);
        System.out.println(power);
        int s = (int)power;
        s = s%1337;
        System.out.println(s);
        return sum;


    }
}
