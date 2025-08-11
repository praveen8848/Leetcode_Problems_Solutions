package LeetcodeMedium;

public class Leetcode2023 {
    public static void main(String[] args) {
        String[] nums = {"1","1","1"};
        String target = "11";
        int ans = numOfPairs(nums,target);
        System.out.println(ans);
    }
    static int numOfPairs(String[] nums,String target){
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                while(i != j) {
                    sb.append(nums[i]);
                    sb.append(nums[j]);
                    if (sb.toString().equals(target)) {
                        count++;

                    }
                    sb.delete(0, sb.length());
                    break;
                }
            }
        }
        return count;
    }
}
