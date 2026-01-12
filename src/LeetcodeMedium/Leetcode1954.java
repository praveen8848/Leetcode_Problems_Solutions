package LeetcodeMedium;

public class Leetcode1954 {
    public static void main(String[] args) {
        long neededApples = 13;
        long ans = findit(neededApples);
        System.out.println(ans);
    }

    private static long findit(long neededApples) {
        long l = 1;
        long h = 8;
        long ans = 0;

        while(l<=h){
            long m = l + (h-l)/2;
            long c = function(m);
            if(c>=neededApples){
                ans = m;
                h = m-1;
            }
            else{
                l = m+1;
            }
        }
        return 8*ans;
    }

    private static long function(long m) {
        long t = 0;
        long s = 0;
        long j = 0;
        for(long i = 1;i<=m; i++){
            s += i*j*4;
            j+=3;
            t += 12*i;
        }

        return t+s;
    }
}
