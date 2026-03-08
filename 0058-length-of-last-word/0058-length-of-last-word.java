class Solution {
    public static int lengthOfLastWord(String s) {
        int n = s.length();
        // if(n == 1 && (s.charAt(0) != ' ')) {
        //     return 1;
        // }

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