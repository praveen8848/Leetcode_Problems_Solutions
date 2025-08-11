import java.util.Arrays;

public class Leetcode1 {
    public static void main(String[] args) {
        int[] as = {3,4,5};
        int target = 9;
      //  sum(as,target);
        System.out.println(Arrays.toString(sum(as,target)));
        int ans = Math.ceilDiv(6,5);
        System.out.println(ans);
    }
    static int[] sum(int[] name, int target){
        for(int i = 0; i< name.length; i++){
            for(int j = i+1; j< name.length; j++){

                    if(name[i] + name[j] == target) {
                        return new int[]{i, j};
                    }
            }
        }
        return new int[]{-1,-1};
    }
}