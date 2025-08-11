package LeetcodeMedium;



public class Leetcode2865 {
    public static void main(String[] args) {
        int[] heights = {1,2,2,2,6,1,4,6,4};
        long ans = maximumsum(heights);
        System.out.println(ans);
    }
    static long maximumsum(int[] heights){
        long ans = 0;
        long min = 0;
        long  res = Integer.MIN_VALUE;
        int j = 0;
        for(int i = 0; i<heights.length; i++){
            ans = ans + heights[i];
             j = i;
            min = heights[j];
                if(j<=i){
                    while(j>=1) {
                        min =  Math.min( min, heights[j - 1]);
                        ans = ans + min;

                        j--;
                    }
                }
            j = i;
            min = heights[j];
                if(j>=i){
                    while(j< heights.length-1){
                        min =  Math.min(min,heights[j+1]);
                        ans = ans + min;
                        j++;
                    }
                }
                res = Math.max(res, ans);
                ans = 0;
        }
        return res;
    }
}
