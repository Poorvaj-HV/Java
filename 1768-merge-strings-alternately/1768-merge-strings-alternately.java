class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        int n = word1.length(), m = word2.length();

        char[] ans = new char[n + m];
        while(i < n || i < m) {
            if(i < n) {
                ans[j++] = word1.charAt(i);
            }
            if(i < m) {
                ans[j++] = word2.charAt(i);
            }
            i++;
        }

        return new String(ans);
    }
}