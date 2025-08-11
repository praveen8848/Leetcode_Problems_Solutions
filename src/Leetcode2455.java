import java.util.ArrayList;
import java.util.List;

public class Leetcode2455 {
    public static void main(String[] args) {
        int[] nums = { 20,83,85,78,83,85,99,85,72,52,32,24,6,3,89,100,3,5,3,55,93,1,13,88,47,48,46,63};
        int  ans = averageValue(nums);
        System.out.println(ans);
    }
    static int averageValue(int[] nums){
        float sum = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            if(nums[i]%2 == 0 && nums[i]%3 == 0){
                list.add(nums[i]);
            }
        }
        for(int j = 0; j<list.size(); j++){
            sum = sum + list.get(j);
        }
        float avg = sum/list.size();
        return Math.round(avg);
    }
}
