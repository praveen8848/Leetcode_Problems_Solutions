package LeetcodeMedium;

public class Leetcode1497 {
    public static void main(String[] args) {
        int[] arr = { -1,-1,-1,-1,2,2,-2,-2};
        int k = 10;
         boolean ans = findit(arr,k);
        System.out.println(ans);
    }
    static boolean findit(int[] arr, int k){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == Integer.MIN_VALUE || arr[j] == Integer.MIN_VALUE){
                    continue;
                }
                int sum = (arr[i]+arr[j]);
                if(sum%k == 0){
                    count++;
                    arr[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        if(count >= arr.length/2){
            return true;
        }
        return false;
    }
}
