class Solution {
    public boolean checkZeroOnes(String s) {
        int zeros = 0, cZero = 0;
        int ones = 0, cOne = 0;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '0') {
                cOne = 0;
                cZero++;
                zeros = Math.max(zeros, cZero);
            } else {
                cZero = 0;
                cOne++;
                ones = Math.max(ones, cOne);
            }
        }

        return ones > zeros;
    }
}