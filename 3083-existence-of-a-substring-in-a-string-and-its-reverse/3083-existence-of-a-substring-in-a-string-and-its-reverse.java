class Solution {
    public boolean isSubstringPresent(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        Set<String> hs = new HashSet<>();
        
        for(int i=1; i<rev.length(); i++) {
            String sub = "" + rev.charAt(i-1) + rev.charAt(i);
            hs.add(sub);
        }

        for(int i=1; i<s.length(); i++) {
            String sub = "" + s.charAt(i-1) + s.charAt(i);
            if(hs.contains(sub)) {
                return true;
            }
        }

        return false;
    }
}