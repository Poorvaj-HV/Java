class Solution {
    public static int lengthOfLastWord(String s) {
        int n = s.length();

        int i = n - 1;
        while(s.charAt(i) == ' ') {
            i--;
        }

        int count = 0;
        while(i >= 0 && (s.charAt(i) != ' ')) {
            count++;
            i--;
        }

        return count;
    }
}