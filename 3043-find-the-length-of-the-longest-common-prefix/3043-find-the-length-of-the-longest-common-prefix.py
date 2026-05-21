class Solution:
    def longestCommonPrefix(self, arr1: list[int], arr2: list[int]) -> int:
        # Step 1: Store all prefixes of every number in arr1 into a set
        prefixes = set()
        for val in arr1:
            while val > 0:
                prefixes.add(val)
                val //= 10  # Remove the last digit to get the next prefix
        
        longest_len = 0
        
        # Step 2: For each number in arr2, find its longest prefix in the set
        for val in arr2:
            while val > 0:
                if val in prefixes:
                    # Update max length if this common prefix is longer
                    longest_len = max(longest_len, len(str(val)))
                    # Since we are checking from longest to shortest, 
                    # we can break as soon as we find a match
                    break
                val //= 10
        
        return longest_len
