class Solution {
    public int totalMoney(int n) {
        int week = 7;
        int count = 1;
        int inc = count;
        int money = 0;

        while(n > 0) {
            money += count;
            count++;
            week--;
            if(week == 0) {
                week = 7;
                count = inc + 1;
                inc = count;
            }
            n--;
        }

        return money;
    }
}