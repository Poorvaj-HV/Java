class Solution {
    public boolean canBeEqual(String s1, String s2) {
        int i=0, j=2;
        char[] s = s1.toCharArray();
        while(j < s.length) {
            if(s[i] != s2.charAt(i)) {
                char c = s[i];
                s[i] = s[j];
                s[j] = c;
            }
            i++;
            j++;
        }

        return s2.equals(new String(s));
    }
}