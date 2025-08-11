package LeetcodeMedium;

public class Lee1493 {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1};
        int ans = longestsubseq(nums);
        System.out.println(ans);
    }

    private static int longestsubseq(int[] nums) {
        int i = 0,j = 0;
        int max = 0;
        int count1 = 0;
        int count0 = 0;
        while (i<nums.length){
            if(nums[i] == 1){
                count1++;
            }
            else {
                count0++;
            }
            i++;
            if(count0>=2){
                max = Math.max(max,count1);
                while (count0>=2 && j< nums.length){
                    if(nums[j] == 0){
                        count0--;
                    }
                    else {
                        count1--;
                    }
                    j++;
                }
            }
        }
        if(count1 == nums.length){
            max = count1-1;
        }
        else {
            max = count1;
        }
        return max;
    }
}
