package LeetcodeMedium;

import java.util.HashMap;
import java.util.Map;

public class Leetcode12 {
    public static void main(String[] args) {
        int num =  98;
        String ans = convertit(num);
        System.out.println(ans);
//        I	1
//V	5
//X	10
//L	50
//C	100
//D	500
//M	1000
    }

    private static String convertit(int num) {
        StringBuilder sb = new StringBuilder();
        Map<Integer, String> mp = new HashMap<>();
        mp.put(1,"I");
        mp.put(2,"II");
        mp.put(3,"III");
        mp.put(4,"IV");
        mp.put(5,"V");
        mp.put(6,"VI");
        mp.put(7,"VII");
        mp.put(8,"VIII");
        mp.put(9,"IX");
        String s = String.valueOf(num);
        StringBuilder sb2 = new StringBuilder(s);
        int x = sb2.length();
        for (int i = 0; i < x; i++) {
            if(sb2.length()-i == 4){
                if(sb2.charAt(i) == '1'){
                    sb.append("M");
                }
                else if(sb2.charAt(i) == '2'){
                    sb.append("MM");
                }
                else if(sb2.charAt(i) == '3'){
                    sb.append("MMM");
                }
            }
            else if(sb2.length()-i == 3){
                if(sb2.charAt(i) == '1'){
                    sb.append("C");
                }
                else if(sb2.charAt(i) == '2'){
                    sb.append("CC");
                }
                else if(sb2.charAt(i) == '3'){
                    sb.append("CCC");
                } else if(sb2.charAt(i) == '4'){
                    sb.append("CD");
                } else if(sb2.charAt(i) == '5'){
                    sb.append("D");
                } else if(sb2.charAt(i) == '6'){
                    sb.append("DC");
                } else if(sb2.charAt(i) == '7'){
                    sb.append("DCC");
                } else if(sb2.charAt(i) == '8'){
                    sb.append("DCCC");
                } else if(sb2.charAt(i) == '9'){
                    sb.append("CM");
                }
            }
            else if (sb2.length()-i == 2) {
                if(sb2.charAt(i) == '1'){
                    sb.append("X");
                }
                else if(sb2.charAt(i) == '2'){
                    sb.append("XX");
                }
                else if(sb2.charAt(i) == '3'){
                    sb.append("XXX");
                }else if(sb2.charAt(i) == '4'){
                    sb.append("XL");
                }else if(sb2.charAt(i) == '5'){
                    sb.append("L");
                }else if(sb2.charAt(i) == '6'){
                    sb.append("LX");
                }else if(sb2.charAt(i) == '7'){
                    sb.append("LXX");
                }else if(sb2.charAt(i) == '8'){
                    sb.append("LXXX");
                }else if(sb2.charAt(i) == '9'){
                    sb.append("XC");
                }
            }
            else {
                int b = sb2.charAt(i)-'0';
                if(mp.containsKey(b)){
                    sb.append(mp.get(b));
                }
            }
        }
        return sb.toString();
    }
}
