package LeetcodeMedium;
import java.util.*;

public class Leetcode_contest {
    public static void main(String[] args) {
        String[] instructions = {"jump","add","add","jump","jump","jump"};
        int[] values = {3,5,12,-1,-3,-5};
        long ans = findit(instructions, values);
        System.out.println(ans);
    }

    private static long findit(String[] instructions, int[] values) {
        long ans = 0;
        int index = 0;
        int n = values.length;
        HashSet<Integer> st = new HashSet<>();

        int i = 0;
        while(i>=0 &&i<n){
            if(st.contains(i)){
                break;
            }
            st.add(i);
            if(instructions[i].equals("jump")){
                index = i;
                i = i+values[i];
                if(st.contains(i)){
                    break;
                }
            }
            else{
                ans = ans + values[i];
                i++;
            }
        }
        return ans;
    }
}
