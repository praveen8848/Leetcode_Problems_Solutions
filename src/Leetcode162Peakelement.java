public class Leetcode162Peakelement {
    public static void main(String[] args) {
        int[] nums = { -2147483648,-2147483647};
        int ans = search(nums);
        System.out.println(ans);

    }
    static int search(int[] nums){
        int k = 0;
       // int s = 0;
        int max = Integer.MIN_VALUE;
       /* int e = nums.length-1;
        while(s<e){
            if(nums[s]<nums[s+1] && nums[s+1]>nums[s+2]){
                k = s+1;
            }
            else if(nums[s] < nums[s+1]){
                k = s+1;
            }
            s++;
        }*/
        while(k< nums.length) {
            if (nums[k] > max) {
                max = nums[k];
            }
            k++;
        }
        return max;
    }
}
