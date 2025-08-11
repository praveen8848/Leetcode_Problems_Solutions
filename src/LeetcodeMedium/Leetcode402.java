package LeetcodeMedium;

import java.util.Stack;

public class Leetcode402 {
    public static void main(String[] args) {
        String num = "10001";
        int k = 4;
        String ans = removekdigits(num, k);
        System.out.println(ans);
    }

    private static String removekdigits(String num, int k) {
        Stack<Character>stack=new Stack<>();

        for(char digit:num.toCharArray()){
            while(!stack.isEmpty() && k >0 &&stack.peek() >digit){
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        while(k>0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();

        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.length()>0?sb.toString() :"0";
    }
}
