package LeetcodeMedium;

public class Leetcode80 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int ans = revoveduplicates(nums);
        System.out.println(ans);
    }

    private static int revoveduplicates(int[] nums) {
        int i = 0;
        int a = 0;
        for(int j = 2; j<nums.length; j++){
            if(nums[i] != nums[j]){
                i = i+2;
                nums[i] = nums[j];
            }
            else{
                a++;
            }
        }
        return i+1;
    }
}
