class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        if(s1.length == 0) {
            return true;
        }

        int i=0, j=0;

        while(j < t1.length) {
            if(s1[i] == t1[j]) {
                i++;
                j++;
            } else {
                j++;
            }

            if(i == s1.length) {
                return true;
            }
        }

        return i == s1.length;
    }
}