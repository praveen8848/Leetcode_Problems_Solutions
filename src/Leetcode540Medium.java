import java.util.Arrays;

public class Leetcode540Medium {
    public static void main(String[] args) {
        int[] nums = {3,7,7,10,10,11,11};
        System.out.println(Arrays.toString(nums));
        System.out.println();
        System.out.println("Here is the non duplicate element.");
        int ans = findnonduplicate(nums);
        System.out.println(ans);
    }
    static int findnonduplicate(int[] nums){
        int i = 0;
        int count = nums.length-1;
        while(i<nums.length-2){
            if(nums[i] != nums[i+1]){
                return  nums[i];
            }
            else{
                i = i+2;
            }
        }
        return nums[count];
    }
}
