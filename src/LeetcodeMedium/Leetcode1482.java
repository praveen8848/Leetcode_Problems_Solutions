package LeetcodeMedium;

public class Leetcode1482 {
    public static void main(String[] args) {
        int[] bloomDay = {1000000000,1000000000};
        int m = 1;
        int k = 1;
        int ans = findit(bloomDay, m, k);
        System.out.println(ans);
    }

    private static int findit(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int ans2 = -1;
        if(n<m*k){
            return -1;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            min = Math.min(min, bloomDay[i]);
            max = Math.max(max, bloomDay[i]);
        }

        while(min<=max){
            int j = 0;
            int ans = 0;
            int count = 0;
            int mid = min + (max - min)/2;
            while( j<n){
                if(bloomDay[j] <= mid){
                    count++;
                }
                else{
                    ans = ans  + count/k;
                    count = 0;
                }
                j++;
            }
            if(count != 0){
                ans = ans  + count/k;
            }
            if(ans >= m){
                ans2 =  min;
                max =  mid - 1;
            }
            else{
                min  = mid + 1;
            }

        }
        return ans2;
    }
}
