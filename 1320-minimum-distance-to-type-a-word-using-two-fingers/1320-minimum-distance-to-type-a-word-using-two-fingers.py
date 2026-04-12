class Solution:
    def minimumDistance(self, word: str) -> int:
        memo = {}
        
        def get_dist(char1, char2):
            if char1 is None: return 0

            c1, c2 = ord(char1) - ord('A'), ord(char2) - ord('A')
            return abs(c1 // 6 - c2 // 6) + abs(c1 % 6 - c2 % 6)

        def dp(index, f1, f2):

            if index == len(word):
                return 0
            
            state = (index, f1, f2)
            if state in memo:
                return memo[state]
            
            target = word[index]
            

            res1 = get_dist(f1, target) + dp(index + 1, target, f2)
            



            res2 = get_dist(f2, target) + dp(index + 1, f1, target)
            
            memo[state] = min(res1, res2)
            return memo[state]




        return dp(0, None, None)
