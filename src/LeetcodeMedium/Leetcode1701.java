package LeetcodeMedium;

public class Leetcode1701 {
    public static void main(String[] args) {
        int[][] customers = {{1, 1000000}, {1000001, 1}};
        double ans = averageWaitingtime(customers);
        System.out.println(ans);
    }

    private static double averageWaitingtime(int[][] customers) {
        int n = customers.length;
        double sum = 0;
        int arrival = customers[0][0];
        for (int i = 0; i < n; i++) {
            if(customers[i][0]>arrival){
                arrival = customers[i][0];
            }
            int  duration = arrival + customers[i][1];
            arrival = customers[i][0];
            sum =  sum +  duration - arrival;
            arrival =  duration;
        }
        System.out.println(sum);
        return sum/n;
    }
}
