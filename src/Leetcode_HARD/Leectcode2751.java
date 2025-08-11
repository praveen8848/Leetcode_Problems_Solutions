package Leetcode_HARD;

import java.util.*;

public class Leectcode2751 {
    public static void main(String[] args) {
        int[] positions = {3,40};
        int[] healths = {49,11};
        String directions = "LL";
         List<Integer> list =  survivedRobotsHealths(positions,healths,directions);
        System.out.println(list);
    }

    private static List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int a = 0;
        int b = 0;
        int e = 0;

        for (int i = 0; i < positions.length; i++) {
            list2.add(positions[i]);
        }
        Arrays.sort(positions);
        while (a< positions.length) {

            for (int i = 0; i < list2.size(); i++) {
                if (positions[a] == list2.get(i)){
                    b = i;
                    break;
                }
            }
            if(sb.isEmpty() || st.isEmpty()){
                sb.append(directions.charAt(b));
                st.push(healths[b]);
            }
            else{
                if(directions.charAt(b) != sb.charAt(sb.length()-1)){
                    if(healths[b] > st.peek()){
                        st.pop();
                        st.push(healths[b]-1);
                        sb.deleteCharAt(sb.length()-1);
                        sb.append(directions.charAt(b)-1);
                    }
                    else if (healths[b] == st.peek()) {
                        st.pop();
                        sb.deleteCharAt(sb.length()-1);
                    }
                    else if (healths[b]<st.peek()) {
                        int d = st.pop();
                        st.push(d-1);
                    }
                    e++;
                }
                else{
                    sb.append(directions.charAt(b));
                    st.push(healths[b]);
                }
            }
             a++;
        }
        while(!st.isEmpty()){
            list.add(st.pop());
        }
        if(e == 0){
            Collections.reverse(list);
        }
        return list;
    }
}
