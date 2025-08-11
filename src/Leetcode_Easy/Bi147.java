package Leetcode_Easy;

public class Bi147 {
    public static void main(String[] args) {
        int[] nums = {-1,-4,-1,4};
        int ans = f(nums);
        System.out.println(ans);
    }

    private static int f(int[] nums) {
        int ans = 0;
        int sum = 0;
        int k = 0;
        for (int i = 0; i <= nums.length-3; i++) {
            sum = nums[i];
            for (int j = i+1; j < nums.length && j<i+3; j++) {
                if(k != 0){
                    sum = sum + nums[j];
                }
                k++;
            }
            if(sum == nums[i+1]/2){
                ans++;
            }
            k = 0;
        }
        return ans;
    }

}
