package Leetcode_Easy;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

public class Leetcode1700 {
    public static void main(String[] args) {
        int[] sandwiches = {1,0,0,0,1,1};
        int[] students = {1,1,1,0,0,1};
        int ans = findit(sandwiches,students);
        System.out.println(ans);
    }

    private static int findit(int[] sandwiches, int[] students) {
        int count = 0;
        Stack<Integer> st = new Stack<>();
        Queue<Integer> qt = new ArrayDeque<>();
        for (int i = 0; i < students.length; i++) {
            st.push(sandwiches[sandwiches.length-1-i]);
            qt.add(students[i]);
        }

        while (!qt.isEmpty()){
            if(Objects.equals(qt.peek(), st.peek())){
                st.pop();
                qt.poll();
                count = 0;
            }
            else {
                qt.add(qt.poll());
                count++;
            }
            if(count == qt.size()){
                break;
            }
        }
        return qt.size();
    }
}
