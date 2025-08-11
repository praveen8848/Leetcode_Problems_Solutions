package LeetcodeMedium;

public class Leetcode713 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 0;
        int ans = findit(nums,k);
        System.out.println(ans);
    }

    private static int findit(int[] nums, int k) {
        int count  = 0;
        int multiple = 1;
        int j = 0;
        int i = 0;
        for(i = 0; i<nums.length; i++){
            if(nums[i]<k){
                count++;
            }
            multiple = multiple*nums[i];
            if(multiple<k){
                count++;
            }
            while(multiple>=k && j<nums.length){
                if(multiple>=k){
                    multiple = multiple/nums[j];
                }
                j++;
            }
            count = count + j;
        }
        while(i-j != 1){
            j++;
        }
        count = count + j;
        return count-1;
    }
}
