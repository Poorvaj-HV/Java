class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int len = 0, maxL = 0;
        int l = 0, r = 0;
        HashSet<Character> hs = new HashSet<>();

        while(r < s.length()) {
            while(hs.contains(s.charAt(r))) {
                hs.remove(s.charAt(l));
                l++;
            }

            hs.add(s.charAt(r));
            len = hs.size();
            maxL = Math.max(maxL, len);
            r++;
        }

        return maxL;
    }
}