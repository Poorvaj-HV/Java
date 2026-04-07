class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) {
            return 0;
        }

        int idx = -1;

        int l = 0, r = 0;
        while(r < haystack.length()) {
            if(haystack.charAt(r) == needle.charAt(l)) {
                if(idx == -1) {
                    idx = r;
                }
                l++;

                if(l == needle.length()) {
                    return idx;
                }
                r++;
            } else {
                if(idx != -1) {
                    r = idx + 1;
                } else {
                    r++;
                }
                idx = -1;
                l = 0;
            }
        }

        return -1;
    }
}