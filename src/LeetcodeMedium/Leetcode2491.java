package LeetcodeMedium;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode2491 {
    public static void main(String[] args) {
        int[] skills = {3,2,5,1,3,4};
        long ans = findteam(skills);
        System.out.println(ans);
    }

    private static long findteam(int[] skill) {
        long ans = 0;
        int sum = 0;
        Arrays.sort(skill);
        int s = 0;
        int e = skill.length-1;
        int total = skill[s] + skill[e];
        while(s<e){
            sum = skill[s] + skill[e];
            if(sum == total){
                ans = ans + skill[s] * skill[e];
            }
            else {
                return -1;
            }
            s++;
            e--;
        }
        return ans;
    }
}
