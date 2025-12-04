import java.util.Stack;

class Solution {
    public static void main(String[] args) {
        String s = "RLRLSL";
        int ans = countCollisions(s);
        System.out.println(ans);
    }
    public static  int countCollisions(String directions) {
        Stack<Character> st = new Stack<>();
        int ans = 0;
        for (int i = 0; i < directions.length(); i++) {
            char ch = directions.charAt(i);
            if (st.isEmpty()) {
                st.push(ch);
            } else if (ch == 'S' && st.peek() == 'R') {
                while (!st.isEmpty() && st.peek() == 'R') {
                    ans++;
                    st.pop();
                }
                st.push('S');
            } else if (ch == 'L' && (st.peek() == 'S' || st.peek() == 'R')) {
                if (st.peek() == 'S') {
                    ans++;
                    st.push('S');
                } else {
                    while (!st.isEmpty() && st.peek() == 'R') {
                        ans++;
                        st.pop();
                    }
                    ans++;
                    st.push('S');
                }
            } else {
                st.push(ch);
            }
        }
        return ans;
    }
}