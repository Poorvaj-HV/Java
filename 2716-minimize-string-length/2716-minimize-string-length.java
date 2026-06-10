class Solution {
    public int minimizedStringLength(String s) {
        Set<Character> hs = new HashSet<>();
        for(char x : s.toCharArray()) {
            hs.add(x);
        }

        return hs.size();
    }
}