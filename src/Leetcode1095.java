public class Leetcode1095 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,3,1};
        int target = 0;
        int ans = findin(nums, target);
        System.out.println(ans);
    }
    static int findin(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            int m =  s + (e-s)/2;
            if(target<nums[m]){
                e = m-1;
            }
            else if(target>nums[m]){
                s = m+1;
            }
            else{
                return m;
            }
        }
        return -1;
    }
}
