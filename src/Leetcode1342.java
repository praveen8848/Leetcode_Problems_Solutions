// unsolved

public class Leetcode1342 {
    public static void main(String[] args) {
      int num = 8;
      int ans = counting(num);
        System.out.println(ans);
    }
    static int count = 0;
    static int counting(int num){
        if(num == 0){
            return count;
        }
        if(num%2 == 0){
            count++;
            return counting(num/2);
        }
        count++;
        return  counting(num-1);
    }
}
