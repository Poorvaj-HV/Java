class Solution:
    def numberOfSpecialChars(self, word: str) -> int:
        first_upper = {}
        last_lower = {}
        
        # Record positions
        for i, char in enumerate(word):
            if char.islower():
                last_lower[char] = i
            elif char.isupper() and char not in first_upper:
                first_upper[char] = i
                
        # Count special characters
        count = 0
        for char in last_lower:
            upper_char = char.upper()
            # The lowercase letter must appear before any uppercase counterpart
            if upper_char in first_upper and last_lower[char] < first_upper[upper_char]:
                count += 1
                
        return count
