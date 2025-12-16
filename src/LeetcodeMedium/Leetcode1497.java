package LeetcodeMedium;

public class Leetcode1497 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,10,6,7,8,9};
        int k = 5;
         boolean ans = findit(arr,k);
        System.out.println(ans);
    }
    static boolean findit(int[] arr, int k){
        int[] freq = new int[k+1];

        for(int i = 0; i<arr.length; i++){
            int r = (arr[i]%k+k)%k;
            freq[r]++;
        }
        if (freq[0] % 2 != 0) return false;
        for (int i = 1; i < k; i++) {
            if (freq[i] != freq[k - i]) {
                return false;
            }
        }
        return true;
    }
}
