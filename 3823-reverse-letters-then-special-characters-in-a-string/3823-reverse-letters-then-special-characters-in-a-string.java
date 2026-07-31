class Solution {
    public String reverseByType(String s) {
        char[] letters = new char[s.length()];
        char[] spChars = new char[s.length()];

        int i = 0; 
        int j = 0;

        for(int k=s.length()-1; k>=0; k--) {
            char x = s.charAt(k);
            if(x >= 'a' && x <= 'z') {
                letters[i++] = x;
            } else {
                spChars[j++] = x;
            }
        }

        char[] result = new char[s.length()];
        i = 0;
        j = 0;
        int idx = 0;
        for(char x : s.toCharArray()) {
            if(x >= 'A' && x <= 'Z' || x >= 'a' && x <= 'z') {
                result[idx++] = letters[i++];
            } else {
                result[idx++] = spChars[j++];
            }
        }

        return new String(result);
    }
}