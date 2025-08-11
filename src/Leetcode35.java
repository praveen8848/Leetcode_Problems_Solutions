public class Leetcode35 {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 6;
        int ans = search(nums,target);
        System.out.println(ans);
    }
    static int search(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            int m = s + (e - s)/2;
            if(nums[m]<target){
                s = m+1;
            }
            else if(nums[m]>target){
                e = m-1;
            }
            else  {
                return m;
            }
        }
        return s;
    }
}
