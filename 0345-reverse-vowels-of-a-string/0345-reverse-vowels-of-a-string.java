class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] ch = s.toCharArray();
        int i = 0, j = ch.length - 1;

        while(i < j) {
            if(!vowels.contains(ch[i])) {
                i++;
            } else if(!vowels.contains(ch[j])) {
                j--;
            } else {
                char c = ch[i];
                ch[i] = ch[j];
                ch[j] = c;
                i++;
                j--;
            }
        }

        return new String(ch);
    }
}