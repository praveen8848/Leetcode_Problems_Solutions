package LeetcodeMedium;


public class Leetcode2134 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,1,0,1,1,0};
        int ans = minswap(nums);
        System.out.println(ans);
    }

    private static int minswap(int[] nums) {
        int countOne = 0;
        for (int num : nums) {
            if (num == 1) {
                countOne++;
            }
        }

        // If there are no 1s or only one 1, no swaps needed
        if (countOne == 0 || countOne == 1) {
            return 0;
        }

        int n = nums.length;
        int minSwaps = Integer.MAX_VALUE;
        int currentZeroCount = 0;

        // Calculate the number of zeros in the first window of size countOne
        for (int i = 0; i < countOne; i++) {
            if (nums[i] == 0) {
                currentZeroCount++;
            }
        }
        minSwaps = currentZeroCount;

        // Slide the window across the circular array
        for (int i = 1; i < n; i++) {
            // Remove the element going out of the window
            if (nums[i - 1] == 0) {
                currentZeroCount--;
            }
            // Add the new element coming into the window
            if (nums[(i + countOne - 1) % n] == 0) {
                currentZeroCount++;
            }
            // Update the minimum swaps
            minSwaps = Math.min(minSwaps, currentZeroCount);
        }

        return minSwaps;
    }
}
