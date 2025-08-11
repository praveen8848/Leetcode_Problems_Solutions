package Leetcode_Easy;

public class Lcnew {
    public static void main(String[] args) {
        int[] quantities = {5,7};
        int n = 2;
        int ans = findit(quantities,n);
        System.out.println(ans);
    }
    static int findit(int[] quantities, int n){
        int j  = Integer.MIN_VALUE;
        int ans = 0;
        for(int i = 0; i<quantities.length; i++){
            j = Math.max(j,quantities[i]);
        }
        int i = 0;
        while(i<=j){
            int mid = i + (j - i)/2;
            int a = findit(quantities, mid,n);
            if(a<=n){
                ans = mid;
                j = mid - 1;

            }
            else{

                i = mid + 1;
            }
        }
        return ans;
    }

    static int findit(int[] quantities, int mid,  int n){
        int ans = 0;
        if(mid == 0){
            return n + 1;
        }
        for(int i = 0; i<quantities.length; i++){
            ans = ans + quantities[i]/mid;
            if(quantities[i]%mid != 0){
                ans++;
            }
            if(ans> n){
                break;
            }
        }
        return ans;
    }
}
