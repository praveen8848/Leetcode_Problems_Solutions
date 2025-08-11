package LeetcodeMedium;
import java.util.*;

public class Leetcode3066 {
    public static void main(String[] args) {
        int[] nums = {999999999,999999999,999999999};
        int k = 1000000000;
        int ans = findit(nums, k);
        System.out.println(ans);
    }
    public static int findit(int[] nums, int k){
        Arrays.sort(nums);
        int ans = 0;
         PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>= k){
                break;
            }
            pq.add(nums[i]);
        }
        if(pq.size() == 1){
            pq.add(nums[1]);
        }
        while(!pq.isEmpty() && pq.size()>=2){
            int minA = pq.poll();
            int minB = pq.poll();
             long t = (long) minA*2 + minB;
            if(t<k){
                pq.add((int)t);
            }
            ans++;
        }
        if(pq.size() != 0){
            ans = ans + pq.size();
        }
        return ans;
    }

}
