class Solution {
    public boolean rotateString(String s, String goal) {
        //Concatenation(optimized) approach
        // return s.length() == goal.length() && (s + s).contains(goal);

        //Brute force approach
        if(s.length() != goal.length()) {
            return false;
        }
        
        if(s.equals(goal)) {
            return true;
        }

        for(int i=0; i<s.length(); i++) {
            s = s.substring(1) + s.charAt(0);
            if(s.equals(goal)) {
                return true;
            }
        }

        return false;
    }
}