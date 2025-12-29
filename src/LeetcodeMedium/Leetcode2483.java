package LeetcodeMedium;

public class Leetcode2483 {
    public static void main(String[] args) {
        String customers = "YYNY";
        int ans = bestClosingTime(customers);
        System.out.println(ans);
    }
    public static int bestClosingTime(String customers) {
        int penalty = 0;
        for (char c : customers.toCharArray()) {
            if (c == 'Y') penalty++;
        }

        int minPenalty = penalty;
        int answer = 0;

        for (int i = 0; i < customers.length(); i++) {
            if (customers.charAt(i) == 'Y') {
                penalty--;
            } else {
                penalty++;
            }

            if (penalty < minPenalty) {
                minPenalty = penalty;
                answer = i + 1;
            }
        }

        return answer;
    }
}
