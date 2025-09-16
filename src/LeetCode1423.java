public class LeetCode1423 {
    public static void main(String[] args) {
        int[] cardPoints = {11,49,100,20,86,29,72};
        int k = 4;
        int ans = maxScore(cardPoints, k);
        System.out.println(ans);
    }

    private static int maxScore(int[] cardPoints, int k) {
        int ans = 0;
        int n = cardPoints.length;
        int[] p = new int[n+1];
        int[] p2 = new int[n+1];
        p[1] = cardPoints[0];
        p2[n] = cardPoints[n-1];

        for(int i = 1; i<n; i++){
            p[i+1] = cardPoints[i]+p[i];
            p2[n-i] = cardPoints[n-i-1]+p2[n-i+1];
        }
        ans = Math.max(p[k], p2[n-k+1]);
        k--;
        for(int i = 0; i<n && k>0; i++){
            int L = p[k]+ p2[n-i];
            int R = p2[n-k+1]+p[i+1];
            ans = Math.max(ans, Math.max(L,R));
            k--;
        }
        return ans;

        // Without Prefix Sum
//        int sum = 0, len = cardPoints.length - 1;
//        k = k - 1;
//        for(int i = 0; i <= k; i++)
//            sum += cardPoints[i];
//        int result = sum;
//        for(int i = k; i >= 0; i--){
//            sum = sum - cardPoints[i] + cardPoints[len - (k - i)];
//            result = Math.max(result, sum);
//
//        }
//        return result;
    }

}
