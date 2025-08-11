package LeetcodeMedium;

public class Leetcode3100 {
    public static void main(String[] args) {
        int numBottles = 1;
        int numExchange = 1;
        int ans = maximumBottles(numBottles,numExchange);
        System.out.println(ans);
    }

    private static int maximumBottles(int numBottles, int numExchange) {
        int count = 0;
        int EmptyBottles = 0;
        count = numBottles;
        EmptyBottles = numBottles;

        while (numBottles != 0 || EmptyBottles>= numExchange){
            numBottles = 0;
            if(EmptyBottles>= numExchange){
                EmptyBottles = EmptyBottles - numExchange;
                numExchange = numExchange + 1;
                numBottles = numBottles+1;
            }
            if(numBottles != 0){
                count = count + numBottles;
                EmptyBottles = EmptyBottles + numBottles;
            }
        }
        return count;
    }
}
