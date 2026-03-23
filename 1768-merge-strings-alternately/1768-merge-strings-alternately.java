class Solution {
    public String mergeAlternately(String word1, String word2) {
        String mergedString = new String();

        boolean take = true;
        int i = 0, j = 0;
        while(i < word1.length() && j < word2.length()) {
            if(take) {
                mergedString += word1.charAt(i++);
                take = false;
            } else {
                mergedString += word2.charAt(j++);
                take = true;
            }
        }

        while(i < word1.length()) {
            mergedString += word1.charAt(i++);
        }

        while(j < word2.length()) {
            mergedString += word2.charAt(j++);
        }

        return mergedString;
    }
}