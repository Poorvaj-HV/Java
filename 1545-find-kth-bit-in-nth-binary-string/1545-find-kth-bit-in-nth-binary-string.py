class Solution:
    def findKthBit(self, n: int, k: int) -> str:
        # Base case: S1 = "0"
        if n == 1:
            return "0"
        
        # Length of Sn is 2^n - 1. Middle position is 2^(n-1)
        length = (1 << n) - 1
        mid = length // 2 + 1
        
        if k == mid:
            return "1"  # Middle bit is always '1'
        elif k < mid:
            return self.findKthBit(n - 1, k)  # Left half
        else:
            # Right half: reverse(invert(S_{n-1}))
            # Map k to its corresponding position in the mirrored left half
            # mirrored_k = length - k + 1
            return "0" if self.findKthBit(n - 1, length - k + 1) == "1" else "1"
