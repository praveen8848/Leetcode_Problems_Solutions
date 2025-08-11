package Leetcode_Easy;

public class Leetcode2053 {
    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        int k = 2;
        String ans = returnit(arr, k);
        System.out.println(ans);
    }

    private static String returnit(String[] arr, int k) {
        int couunt = 0;
        boolean checkit = true;
        for(int i = 0; i < arr.length; i++){
            String str1 = arr[i];
            for(int j = 0; j< arr.length ;j++){
                while (j != i) {
                    String str2 = arr[j];
                    if (str1.equals(str2)) {
                        checkit = false;
                    }
                    break;
                }
            }
            if(checkit){
                k--;
                if(k == 0){
                    return str1;
                }
            }
            else {
                checkit = true;
            }
        }
        return "";
    }
}
