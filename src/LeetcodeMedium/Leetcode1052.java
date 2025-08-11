package LeetcodeMedium;

public class Leetcode1052 {
    public static void main(String[] args) {
       int[] customers = {4,10,10};
       int[] grumpy = {1,1,0};
       int minutes = 2;
       int ans = maximumcustomer(customers,grumpy,minutes);
        System.out.println(ans);
    }

    private static int maximumcustomer(int[] customers, int[] grumpy, int minutes) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < customers.length; i++) {
            if(grumpy[i] == 0){
                sum1 = sum1 + customers[i];
            }
        }

        int i = 0, j = 0;
        int max  = Integer.MIN_VALUE;
        int k = 0;
        while(j< grumpy.length){
            sum2 = sum2 + customers[j];
            if(j-i +1 <minutes){
                j++;
            }
           else  if(j-i + 1 >= minutes){
                if(j-i +1 == minutes){
                    if(sum2 > max){
                        max = sum2;
                        k = i;
                    }
                }
                else if(j-i +1 > minutes){
                    sum2 = sum2 - customers[i];
                    i++;
                    if(j-i +1 == minutes){
                        if(sum2 > max){
                            max = sum2;
                            k = i;
                        }
                    }
                }
                j++;
            }
        }

        for (int l = k; l < k + minutes ; l++) {
            if(grumpy[l] == 0){
                max = max - customers[l];
            }

        }
        return sum1 + max;
    }
}
