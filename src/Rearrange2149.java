import java.util.Arrays;

public class Rearrange2149 {
    public static void main(String[] args) {
        int[] nums = { 3,1,-2,-5,2,-4};
        int[] ans = rearrangearrayelement(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] rearrangearrayelement(int[] nums){
        int n = nums.length;
        int[] arr = new int[n/2];
        int j = 0;
        int[] arr2 = new int[n/2];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i]>0){
                arr[j] = nums[i];
                j++;
            }
            else {
                arr2[k] = nums[i];
                k++;
            }
        }
        for (int i = 0; i < n/2; i++) {
            nums[i*2]  = arr[i];
        }
        for (int i = 0; i < n/2; i++) {
            nums[i*2 + 1] = arr2[i];
        }
        return nums;
    }
}
