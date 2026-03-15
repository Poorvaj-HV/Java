class Solution {
    public int maxPower(String s) {
        int currStreak = 1;
        int maxStreak = 1;

        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)) {
                currStreak++;
                maxStreak = Math.max(maxStreak, currStreak);
            } else {
                currStreak = 1;
            }
        }

        return maxStreak;
    }
}