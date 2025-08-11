package LeetcodeMedium;

public class Leetcode2962 {
    public static void main(String[] args) {
        int[] nums = { 1,3,2,3,3};
        int k = 2;
         long ans = countit(nums,k);
        System.out.println(ans);
    }
    static  long countit(int[] nums, int k){
        long count = 0;
        int countmax = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< nums.length; i++){
            max = Math.max(max, nums[i]);
        }

        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == max){
                countmax++;
            }
            while(countmax == k){
                if(nums[j] == max){
                    countmax--;
                }
                j++;
            }
            count = count + j;
        }


        return count;
    }
}
