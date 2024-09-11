package Recursion1;
public class Stone_Stepping {
    private static int minCost(int[] stones, int n, int idx){
        if(idx == n-1) return 0;
        int cost1 = Math.abs(stones[idx] - stones[idx+1]) + minCost(stones, n, idx+1);
        if(n-2 == idx) return cost1;
        int cost2 = Math.abs(stones[idx] - stones[idx+2]) + minCost(stones, n, idx+2);
        return Math.min(cost1,cost2);
    }
    public static void main(String[] args) {
        int[] stones = {10,53,43,85,78,23};
        System.out.println("Minimum cost will be = " + minCost(stones, stones.length,0));
    }
}
