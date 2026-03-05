class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm = new HashMap<>();

        char s1[] = s.toCharArray();
        char t1[] = t.toCharArray();

        for(int i=0; i<s1.length; i++) {
            if(hm.containsKey(s1[i]) && (hm.get(s1[i]) != t1[i])) {
                return false;
            } else if(!hm.containsKey(s1[i]) && hm.containsValue(t1[i])) {
                return false;
            } else {
                hm.put(s1[i], t1[i]);
            }
        }

        return true;
    }
}