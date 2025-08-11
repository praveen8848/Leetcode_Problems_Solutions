package Leetcode_Easy;

public class Leetcode2210 {
    public static void main(String[] args) {
        int[] nums = {8,2,5,7,7,2,10,3,6,2};
        int ans = findit(nums);
        System.out.println(ans);
    }
    private static int findit(int[] nums){
        int count = 0;

        for (int i = 1; i < nums.length - 1; i++) {
            // Skip duplicate elements
            if (nums[i] == nums[i - 1]) continue;

            // Find the closest non-equal left neighbor
            int left = i - 1;
            while (left >= 0 && nums[left] == nums[i]) {
                left--;
            }

            // Find the closest non-equal right neighbor
            int right = i + 1;
            while (right < nums.length && nums[right] == nums[i]) {
                right++;
            }

            if (left >= 0 && right < nums.length) {
                if (nums[i] > nums[left] && nums[i] > nums[right]) {
                    count++; // Hill
                } else if (nums[i] < nums[left] && nums[i] < nums[right]) {
                    count++; // Valley
                }
            }
        }

        return count;
    }
}
