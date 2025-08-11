public class gfg {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,1,1,2,4,2,3};
        int target = 9;
          int ans = subarray(nums,target);
        System.out.println(ans);
    }
    static int subarray(int[] nums,int target){
        int max = 0;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum +nums[i];
            count++;
            if(sum == target){
                sum = 0;
                if(count>max){
                    max = count;
                    count = 0;

                }else{
                    count = 0;
                }
            }
            else if(sum>target){
                sum = 0;
                count = 0;
            }
        }
        return max;
    }
}
