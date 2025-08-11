package LeetcodeMedium;

//You are given a 0-indexed string s and a 0-indexed integer array spaces that describes the indices in
//the original string where spaces will be added. Each space should be inserted before the character at the given index.



public class LeetCode2109 {
    public static void main(String[] args) {
      String s = "spacing";
      int[] spaces = {0,1,2,3,4,5,6};
      String ans =  addSpacess(s, spaces);
        System.out.println(ans);
    }
    static String addSpaces(String s,int[] spaces){
        StringBuilder  sb = new StringBuilder(s);
        int i = 0;
        int j = 0;
        while( j< spaces.length){
             sb.insert(spaces[j]+i," ");
            i++;
            j++;
        }
        return  new String(sb);
    }
     static String addSpacess(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int sIndex = 0;
        int spaceIndex = 0;

        // Traverse the original string and the spaces array
        while (sIndex < s.length()) {
            // If the current index matches a space position, append a space
            if (spaceIndex < spaces.length && sIndex == spaces[spaceIndex]) {
                sb.append(' ');
                spaceIndex++;
            }
            // Append the current character from the original string
            sb.append(s.charAt(sIndex));
            sIndex++;
        }
        return sb.toString();
    }
}
