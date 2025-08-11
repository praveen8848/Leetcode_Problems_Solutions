public class Majorityelement {
    public static void main(String[] args) {
        // fINDING MAJORITY ELEMENT IN AN ARRAY GREATER THAN N/2
        int[] nums = {2,2,1,1,1,2,2};
        int ans = majority(nums);
        System.out.println(ans);
    }
    static int majority(int[] nums){
      int k = 0;
      int r = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                    if(nums[i] == nums[j]) {
                        k++;
                        r = i;
                    }

            }
            if(k> nums.length/2){
                return nums[r];
            }
            else {
                k = 0;
            }
        }
        return 0;
    }
}
