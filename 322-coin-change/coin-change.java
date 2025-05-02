public class Solution {
    public int coinChange(int[] coins, int amount) {
        // int result = helper(coins, amount);
        // return result == Integer.MAX_VALUE ? -1 : result;
        //step 1 of memo
        int[] memo = new int[amount + 1];
        Arrays.fill(memo,-1);
        int result = helperMemo(coins,amount,memo);
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    private int helper(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (amount < 0) return Integer.MAX_VALUE;

        int min = Integer.MAX_VALUE;
        


        for (int coin : coins) {
            int res = helper(coins, amount - coin);
            if (res != Integer.MAX_VALUE) {
                min = Math.min(min, res + 1);
            }
        }
        
        return min;
    }
    private int helperMemo(int[] coins, int amount,int[] memo) {
        if (amount == 0) return 0;
        if (amount < 0) return Integer.MAX_VALUE;

        int min = Integer.MAX_VALUE;

        if (memo[amount] != -1){
            return memo[amount];
        }
        for (int coin : coins) {
            int res = helperMemo(coins, amount - coin,memo);
            if (res != Integer.MAX_VALUE) {
                min = Math.min(min, res + 1);
            }
        }

        memo[amount] = min;

        return min;
    }
}