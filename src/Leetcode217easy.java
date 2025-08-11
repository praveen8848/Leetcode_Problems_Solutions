public class Leetcode217easy {
    public static void main(String[] args) {
        long[] nums = {1,2,3};
        boolean ans = searchduplicate(nums);
        System.out.println(ans);
    }
    static boolean searchduplicate(long[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                while(i != j){
                    if(nums[i] == nums[j]){
                        return true;
                    }
                    break;
                }
            }
        }
        return false;
    }
}
