package LeetcodeMedium;

import java.util.HashMap;

public class LeetcodeContest {
    public static void main(String[] args) {
        int[] nums = {20, 20, 10, 30, 30, 30};
        int ans = findit(nums);
        System.out.println(ans);
    }

    private static int findit(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> mp1 = new HashMap<>();
        HashMap<Integer, Integer> mp2 = new HashMap<>();
        HashMap<Integer, Integer> mp3 = new HashMap<>();

        for( int e : nums){
            mp1.put(e, mp1.getOrDefault(e, 0) +1);
        }
        int ans = -1;
        for(int e : nums){
            int f = mp1.get(e);
            if(!mp3.containsKey(e)){
                mp2.put(f, mp2.getOrDefault(f, 0) +1);
            }
            mp3.put(e, 1);

        }
        for(int e : nums){
            int f = mp1.get(e);
            if(mp2.get(f)==1){
                ans = e;
                break;
            }
        }
        return ans;
    }

}
