package LeetcodeMedium;

public class Leetcode134 {
    public static void main(String[] args) {
        int[] gas = {5,1,2,3,4};
        int[] cost = {4,4,1,5,1};
        int ans  = findit(gas, cost);
        System.out.println(ans);
    }

    private static int findit(int[] gas, int[] cost) {
        int m = 0;
        int n = gas.length;
        int ind = Integer.MIN_VALUE;
        int ans = 0;
        int costSum = 0;
        int gasSum = 0;
        for(int i = 0; i<n; i++){
            costSum = costSum+cost[i];
            gasSum = gasSum+gas[i];
            int u = gas[i]-cost[i];

        }
        if(costSum>gasSum){
            return -1;
        }
        int currentGas = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            currentGas += gas[i] - cost[i];
            if (currentGas < 0) {
                currentGas = 0;
                start = i + 1;
            }
        }

        return start;
    }
}
