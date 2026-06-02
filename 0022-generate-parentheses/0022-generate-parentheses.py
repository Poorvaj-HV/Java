class Solution:
    def generateParenthesis(self, n: int) -> list[str]:
        result = []
        
        def backtrack(open_count: int, close_count: int, current_string: str):
            # Base Case: Valid combination reached
            if len(current_string) == 2 * n:
                result.append(current_string)
                return
            
            # Rule 1: Add open parenthesis if available
            if open_count < n:
                backtrack(open_count + 1, close_count, current_string + "(")
                
            # Rule 2: Add close parenthesis if it matches an open one
            if close_count < open_count:
                backtrack(open_count, close_count + 1, current_string + ")")
                
        backtrack(0, 0, "")
        return result