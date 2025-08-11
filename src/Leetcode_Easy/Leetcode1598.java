package Leetcode_Easy;

public class Leetcode1598 {
    public static void main(String[] args) {
        String[] logs = {"d1/","../","../","../"};
        int ans = minOperations(logs);
        System.out.println(ans);
    }

    private static int minOperations(String[] logs) {
        int steps = 0;
        for(int i = 0; i<logs.length ; i++){
            if(logs[i].equals("../")){
                if(steps>0) {
                    steps--;
                }
            }
            else if(!logs[i].equals("./")){
                 steps++;
            }
        }
        return steps;
    }
}
