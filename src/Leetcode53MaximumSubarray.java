public class Leetcode53MaximumSubarray {
    public static void main(String[] args) {
        int[]  nums = {-2,1,-3,4,-1,2,1,-5,4};
          int ans = maxsubarray(nums);
        System.out.println(ans);
    }
    // Using Kadane's Algorithm
    static int maxsubarray(int[] nums){
        int max1 =  Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if(sum>max1) {
                max1 = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return max1;
    }
}
