class Solution {
    public List<String> commonChars(String[] words) {
        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);

        for(String word: words) {
            int[] charCount = new int[26];
            for(char ch : word.toCharArray()) {
                charCount[ch - 'a']++;
            }

            // Intersection: Keeping only the minimum count seen so far for each letter
            for(int i=0; i<26; i++) {
                minFreq[i] = Math.min(minFreq[i], charCount[i]);
            }
        }

        List<String> ans = new ArrayList<>();
        for(int i=0; i<26; i++) {
            while(minFreq[i] > 0) {
                ans.add(Character.toString(i + 'a'));
                minFreq[i]--;
            }
        }

        return ans;
    }
}