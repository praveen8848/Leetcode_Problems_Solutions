

// Got TLE due to Not using Hashmap


public class Leetcode792 {
    public static void main(String[] args) {
      String s = "dsahjpjauf";
      String[] words = {"ahjpjau","ja","ahbwzgqnuk","tnmlanowax"};
      int ans = numMatchingSubseq(s,words);
        System.out.println(ans);
    }
    static int numMatchingSubseq(String s, String[] words){
      int h = 0;
      int j = 0;
      while(j<words.length){
          String word = words[j];
          int l = 0;
              for (int k = 0; k < s.length() && l < word.length(); k++) {
                  if (s.charAt(k) == word.charAt(l)) {
                      l++;
                      if (l == word.length()) {
                          h++;
                          break;
                      }
                  }
              }
          j++;
      }
      return h;
    }
}
