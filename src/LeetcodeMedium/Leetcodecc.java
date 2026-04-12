package LeetcodeMedium;

public class Leetcodecc {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int ans = findit(nums);
    }

    private static int findit(int[] nums) {
        int count = 0;
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i<nums.length; i++){
            int t = nums[i];

            if(i%2 == 0){
                if(t < 2){
                    count += (2 - t);
                    t = 2;
                }
                while(!prime(t)){
                    count++;
                    t++;
                }
            }
            else{
                while(prime(t)){
                    count++;
                    t++;
                }
            }
        }
        return count;
    }
    public static boolean prime(int k ){
        if(k <= 1){
            return false;
        }
        for(int i = 2; i<=Math.sqrt(k); i++){
            if(k%i == 0){
                return false;
            }
        }
        return true;
    }
}
