import java.util.Arrays;

public class Leetcode167Medium {
    public static void main(String[] args) {
        int[] numbers = {3,24,50,79,88,150,345};
        int target = 129;
        int[] ans = findit(numbers,target);
        System.out.println(Arrays.toString(ans));
        int[] anss = rightanswer(numbers,target);
        System.out.println(Arrays.toString(anss));
    }

     static int[] findit(int[] numbers, int target) {
        int x = 0;
        int y = numbers.length-1;
        while(x< numbers.length) {
            while (y > 0) {
                if (numbers[x] + numbers[y] == target) {
                    return new int[]{x + 1, y + 1};
                } else {
                    y--;
                }
            }
            x++;
            y = numbers.length-1;
        }
        return new int[]{0,0};
    }
    static int[] rightanswer(int[] numbers, int target){
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int total = numbers[left] + numbers[right];

            if (total == target) {
                return new int[]{left + 1, right + 1};
            } else if (total > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1};
    }
}
