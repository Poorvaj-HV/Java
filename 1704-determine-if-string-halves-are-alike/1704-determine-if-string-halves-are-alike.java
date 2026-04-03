class Solution {
    public boolean halvesAreAlike(String s) {
        int l = 0, r = s.length() - 1;
        int leftCount = 0, rightCount = 0;

        while(l < r) {
            if(s.charAt(l) == 'a' || s.charAt(l) == 'e' || s.charAt(l) == 'i' || s.charAt(l) == 'o' || s.charAt(l) == 'u' || s.charAt(l) == 'A' || s.charAt(l) == 'E' || s.charAt(l) == 'I' || s.charAt(l) == 'O' || s.charAt(l) == 'U') {
                leftCount++;
            } 

            if(s.charAt(r) == 'a' || s.charAt(r) == 'e' || s.charAt(r) == 'i' || s.charAt(r) == 'o' || s.charAt(r) == 'u' || s.charAt(r) == 'A' || s.charAt(r) == 'E' || s.charAt(r) == 'I' || s.charAt(r) == 'O' || s.charAt(r) == 'U') {
                rightCount++;
            }

            l++;
            r--;
        }

        return leftCount == rightCount;
    }
}