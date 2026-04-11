class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fChange = 0;
        int tChange = 0;

        for(int x: bills) {
            if(x == 5) {
                fChange++;
            } else if(x == 10) {
                if(fChange > 0) {
                    fChange--;
                    tChange++;
                } else {
                    return false;
                }
            } else {
                if(fChange > 0 && tChange > 0) {
                    fChange--;
                    tChange--;
                } else if(fChange >= 3) {
                    fChange -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}