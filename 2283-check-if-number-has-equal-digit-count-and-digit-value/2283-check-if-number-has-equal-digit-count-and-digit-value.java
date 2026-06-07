class Solution {
    public boolean digitCount(String num) {
        int[] frequency = new int[10];

        for(char x : num.toCharArray()) {
            frequency[x - '0']++;
        }

        for(int i=0; i<num.length(); i++) {
            if(num.charAt(i) - '0' != frequency[i]) {
                return false;
            }
        }

        return true;
    }
}