package LeetcodeMedium;

public class Leetocde670 {
    public static void main(String[] args) {
        int num = 2736;
        int ans = maximumSwap(num);
        System.out.println(ans);
    }

    private static int maximumSwap(int num) {
        char[] arr = Integer.toString(num).toCharArray();
        int n = arr.length;
        int[] maxRight = new int[n];
        maxRight[n-1] = n-1;

        for(int i = n-2; i>=0; i--){
            maxRight[i] = arr[i]>arr[maxRight[i+1]]?i:maxRight[i+1];
        }

        for(int i =0; i<n; i++){
            if(arr[i]<arr[maxRight[i]]){
                char t = arr[i];
                arr[i] = arr[maxRight[i]];
                arr[maxRight[i]] = t;
                return Integer.parseInt(new String(arr));
            }
        }
        return num;
    }
}
