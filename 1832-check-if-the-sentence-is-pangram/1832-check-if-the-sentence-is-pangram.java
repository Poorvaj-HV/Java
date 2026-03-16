class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> hs = new HashSet<>();

        for(char x: sentence.toCharArray()) {
            hs.add(x);
        }

        if(hs.size() == 26) {
            return true;
        }

        return false;
    }
}