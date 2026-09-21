class Solution {
    public int reverseDegree(String s) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int ans = 0;

        for(int i=0; i<s.length(); i++) {
            char x = s.charAt(i);
            ans += (26 - (x - 'a')) * (i + 1);
        }

        return ans;
    }
}