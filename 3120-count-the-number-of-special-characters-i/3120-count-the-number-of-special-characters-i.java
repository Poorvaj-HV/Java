import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> lowerSet = new HashSet<>();
        Set<Character> upperSet = new HashSet<>();

        // Step 1: Separate into distinct casings
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isLowerCase(ch)) {
                lowerSet.add(ch);
            } else if (Character.isUpperCase(ch)) {
                upperSet.add(ch);
            }
        }

        // Step 2: Safely check overlaps using standard character conversions
        int count = 0;
        for (char ch : lowerSet) {
            if (upperSet.contains(Character.toUpperCase(ch))) {
                count++;
            }
        }

        return count;
    }
}