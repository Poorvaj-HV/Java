class Solution {
    public static int lengthOfLastWord(String s) {
        int n = s.length();
        if(n == 1 && (s.charAt(0) != ' ')) {
            return 1;
        }

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
        // int right = 0, left = 0;
        // boolean occurance = true;
        // for(int i=n-1; i>=0; i--) {
        //     if(occurance && (s.charAt(i) != ' ')) {
        //         occurance = false;
        //         right = i;
        //     }
        //     if(i > 0 && (s.charAt(i) != ' ') && (s.charAt(i-1) == ' ')) {
        //         left = i;
        //         break;
        //     }
        // }
        // int countLength = s.substring(left, right).length();

        // return countLength + 1;
    }
}