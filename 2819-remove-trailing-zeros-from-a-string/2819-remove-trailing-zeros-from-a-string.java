class Solution {
    public String removeTrailingZeros(String num) {
        int n = num.length();
        int lNZi = 0;

        for(int i=0; i<n; i++) {
            if(num.charAt(i) != '0') {
                lNZi = i;
            }
        }

        return num.substring(0, lNZi+1);
    }
}