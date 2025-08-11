public class Leetcode43 {
    public static void main(String[] args) {
        String num1 = "498828660196";
        String num2 = "84047762953";
        String ans = multiply(num1,num2);
        System.out.println(ans);
    }
    static String multiply(String num1, String num2){
        long n1 = Long.parseLong(num1);
        long n2 = Long.parseLong(num2);
        long multiply = n1*n2;
        String num3 = " " + multiply;
        return num3;
    }
}
