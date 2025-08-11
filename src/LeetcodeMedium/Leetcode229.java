package LeetcodeMedium;


import java.util.*;

public class Leetcode229 {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        List<Integer> lst = majorityelement2(nums);
        System.out.println(lst);
    }

    private static List<Integer> majorityelement2(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if(mp.isEmpty()){
                mp.put(x,1);
            }
            else if(mp.containsKey(x)){
                mp.put(x, mp.get(x) + 1);
            }
            else {
                mp.put(x, 1);
            }
        }
        for(var el : mp.entrySet()){
            int a = el.getValue();
            int b= el.getKey();
            if(a>nums.length/3){
                ans.add(b);
            }
        }
        return ans;
    }

}
