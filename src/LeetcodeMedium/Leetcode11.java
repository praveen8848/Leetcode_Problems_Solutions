package LeetcodeMedium;

public class Leetcode11 {
    public static void main(String[] args) {
        int[] heights = {1,1};
        int ans = maximumarea(heights);
        System.out.println(ans);
    }

    public static int maximumarea(int[] height) {
        int maxArea = 0;
        int i  = 0;
        int j = height.length-1;
        while (i<j){
            int min = Math.min(height[i], height[j]);
            maxArea = Math.max(maxArea, min*(j-i));
            if(height[j]<=height[i]){
                j--;
            }
            else if(height[i]< height[j]){
                i++;
            }
        }
        return maxArea;
    }

}
