public class leetcode27 {
    public static void main(String[] args) {
    int nums[] = {0,0,1,1,1,2,2,3,3,4};
      int ans = removeduplicate(nums);
        System.out.println(ans);
    }
    static int removeduplicate(int[] nums){
        int k = 1;
            for(int i = 1; i<=nums.length-1; i++){
                if(nums[i-1] == nums[i] ){
                    continue;
                }
                else{
                    nums[k++] = nums[i-1];
                }
            }
        return k;
    }

}
