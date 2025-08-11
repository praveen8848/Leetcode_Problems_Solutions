package Leetcode_Easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class Leetcode_Contest {
    public static void main(String[] args) {
        int[] nums = {5,2,3,1};
        int ans = findit(nums);
        System.out.println(ans);
    }

    private static int findit(int[] nums) {
        Deque<Integer> stack = new ArrayDeque<>();
        int operations = 0;

        for (int num : nums) {
            while (!stack.isEmpty() && num < stack.peek()) {
                // Merge the top of the stack with the next element
                int merged = stack.pop() + num;
                num = merged;
                operations++;
            }
            stack.push(num);
        }

        return operations-1;
    }
}
