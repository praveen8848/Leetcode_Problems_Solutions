package Leetcode_Easy;

import java.util.ArrayList;
import java.util.List;

public class lccon {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        int l = 2;
        int r = 4;
        int ans = foundit(lst,l,r);
        System.out.println(ans);
        StringBuilder sb = new StringBuilder();
        sb.indexOf("aa");


        int f = lst.get(2);
        System.out.println(f);
        String s = "aabbcc";
        if(s.contains("aa")){
            System.out.println(1);
        }

    }

    private static int foundit(List<Integer> nums, int l, int r) {
        int[] psum = new int[nums.size()];
        int sum = 0;
        for(int i = 0; i<nums.size(); i++){
            sum = sum + nums.get(i);
            psum[i] = sum;
        }

        int i = 0;
        int j = 0;
        int k = 0;
        int ans = Integer.MAX_VALUE;
        int m = 0;

        while(i<nums.size()){
            if(i-j+1<l){
                i++;
            }
            if(i-j+1>=l && i-j+1<=r){
                if( m == 0){
                    k = psum[i];
                    m++;
                }
                if(k>0){
                    ans = Math.min(ans,k);
                }
                while(i-j+1<r){
                    i++;
                    k = psum[i];
                }
                if(k>0){
                    ans = Math.min(ans,k);
                }
                while(j<nums.size() && i-j+1>l){
                    k = k - psum[j];
                    j++;

                }
                if(k>0){
                    ans = Math.min(ans,k);
                }
                i++;
                if(i<psum.length){
                    k = psum[i]-psum[j];
                }

            }
            else{
                if(k>0){
                    ans = Math.min(ans,k);
                }
                while(i-j+1<l){
                    i++;
                    k = psum[i];
                }
                if(k>0){
                    ans = Math.min(ans,k);
                }
                while (i-j+1>r){
                    k = k - psum[j];
                    j++;

                }
                if(k>0){
                    ans = Math.min(ans,k);
                }
                i++;
                if(i< psum.length){
                    k = psum[i]-psum[j];
                }
            }

        }
        return ans == Integer.MAX_VALUE ? -1:ans;
    }
}
