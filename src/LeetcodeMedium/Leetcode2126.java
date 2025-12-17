package LeetcodeMedium;

import java.util.Arrays;

public class Leetcode2126 {
    public static void main(String[] args) {
        int[] asteroids = {3,6,2,9,5,2};
        int mass = 4;
        System.out.println(asteroidsDestroyed(mass, asteroids));
    }
    public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        int n = asteroids.length;
        long ans = mass;
        for(int as : asteroids){
            if(as<=ans){
                ans += as;
            }
            else{
                return false;
            }
        }
        return true;
    }

}
