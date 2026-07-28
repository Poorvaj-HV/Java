class Solution {
    public String reverseOnlyLetters(String s) {
        List<Character> letters = new ArrayList<>();

        for(int i=s.length()-1; i>=0; i--) {
            char x = s.charAt(i);
            if(x >= 'a' && x <= 'z' || x >= 'A' && x <= 'Z') {
                letters.add(x);
            }
        }

        char[] result = new char[s.length()];
        int i = 0;
        int j = 0;
        for(char x : s.toCharArray()) {
            if(x >= 'a' && x <= 'z' || x >= 'A' && x <= 'Z') {
                result[i++] = letters.get(j++);
            } else {
                result[i++] = x;
            }
        }

        return new String(result);
    }
}