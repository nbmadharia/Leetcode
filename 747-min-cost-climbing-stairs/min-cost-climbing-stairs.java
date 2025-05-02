class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int mem[]= new int[n];
        Arrays.fill(mem,-1);
        return Math.min(helperMem(n-1,cost, mem),helperMem(n-2,cost, mem));

    }
    public int helperMem(int i,int[] cost,int[] mem){
        if (i == 0) return cost[0]; // Base case
        if (i == 1) return cost[1]; // Base case

        if(mem[i] != -1){
            return mem[i];
        }
        mem[i] = cost[i] + Math.min(helperMem(i - 1, cost, mem), helperMem(i - 2, cost, mem));
        return mem[i];
    }
}