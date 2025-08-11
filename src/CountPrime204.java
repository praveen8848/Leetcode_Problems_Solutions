public class CountPrime204 {
    public static void main(String[] args) {
        int n = 499989;
        int ans = prime(n);
        System.out.println(ans);
    }
    static int prime(int n){
        int k = 0;
        while(n>2) {
            int i = 2;
            while(i<n) {
                int j = 2;
                    while (i != j) {
                        if (i % j == 0) {
                            i++;
                            if(i == n){
                                return k;
                            }
                            j = 1;
                        }
                        j++;
                    }
                    k++;
                    i++;
            }
            break;
        }
        return k;
    }
}
