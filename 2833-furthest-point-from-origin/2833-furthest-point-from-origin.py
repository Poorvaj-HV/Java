class Solution:
    def furthestDistanceFromOrigin(self, moves: str) -> int:
        # Count occurrences of each character type
        countL = moves.count('L')
        countR = moves.count('R')
        count_ = moves.count('_')
        
        # Max distance = absolute net fixed moves + all flexible moves
        return abs(countL - countR) + count_
