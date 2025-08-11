package LeetcodeMedium;

public class Leetcode2825 {
    public static void main(String[] args) {
        String str1 = "zc";
        String str2 = "ad";
        boolean ans = findit(str1,str2);
        System.out.println(ans);
    }
    static boolean findit(String str1, String str2){
       int i = 0;
       int j = 0;
       int count = 0;
       boolean flag = false;
        int a = 0;
        int  b = 0;

       while(i<str1.length() || j <str2.length()){
           if(i< str1.length()){
              a = str1.charAt(i)-96;
           }
           if(j<str2.length()){
               b = str2.charAt(j);
           }

           if( a == b){
               count++;
               flag = true;
           }
           else{
               if( a== 26){
                   a = 1;
               }
               else{
                   a++;
               }
               if(a== b){
                   count++;
                   flag = true;
               }
           }

           if(i< str1.length()){
               i++;
           }
           if(j<str2.length() && flag){
               j++;
               flag = false;
           }
       }
       return count >= str2.length();
    }
}
