class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for(int[] account: accounts) {
            int sum = 0;
            for(int i=0; i<account.length; i++) {
                sum += account[i];
            }
            maxWealth = Math.max(maxWealth, sum);
        }
        
        return maxWealth;
    }
}