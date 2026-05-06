class Solution {
    public boolean isSubstringPresent(String s) {
        String st = new StringBuilder(s).reverse().toString();

        for(int i=1; i<s.length(); i++) {
            String sub = "" + s.charAt(i-1) + s.charAt(i);
            if(st.contains(sub)) {
                return true;
            }
        }

        return false;
    }
}